
import java.util.Scanner;

class Crop{
	String name;
	double re;//revenue efficiency
	int sum;
	
	Crop(String str,int p,int a,int b,int c,int d,int e,int f,int s,int m){
		this.name=str;
		sum=a+b+c+(d+e)*m;
		re=((s*m*f-p)*1.0)/(sum*1.0);
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
				if(Math.abs(c[j].re-c[max].re)<0.0000000001){
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
				//System.out.println(c[i].name+" "+c[i].re+" "+c[i].sum);
				System.out.println(c[i].name);
			}
			System.out.println("#");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}