import java.util.Scanner;

class Crop{
	String name;
	double re;//revenue efficiency
	int sum,p,s;
	
	Crop(String str,int p,int a,int b,int c,int d,int e,int f,int s,int m){
		this.name=str;
		if(m==1){
			sum=a+b+c+d+e+f;
			this.re=(s-p)*1.0/((a+b+c+d+e+f)*1.0);
		}
		else{
			sum=a+b+c+d+e;
			for(int i=1;i<m;i++){
				sum+=(d+e);
			}
			this.re=((s*m-p)*1.0)/(sum*1.0);
		}
	}
}

public class Main {
	void run(){
		Scanner sc=new Scanner(System.in);
		int n;
		Crop c[];
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			c=new Crop[n];
			for(int i=0;i<n;i++){
				c[i]=new Crop(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			int max;
			for(int i=0;i<n;i++){
				max=i;
				for(int j=i;j<n;j++){
					if(c[j].re==0.0 && c[max].re==0.0){
						if(c[max].sum<c[j].sum){
							max=j;
						}
					}
					else if(Math.abs(c[j].re-c[max].re)<0.0000000001){
						if(c[max].name.compareTo(c[j].name)>0){
							max=j;
						}
					}
					else if(c[max].re<c[j].re){
						max=j;
					}
				}
				Crop temp=c[i];
				c[i]=c[max];
				c[max]=temp;
			}
			for(int i=0;i<n;i++){
				System.out.println(c[i].name);
			}
			System.out.println("#");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}