import java.util.Scanner;
public class Main {

	static int max(int a[]){
		int max=0;
		max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j,k=0,m=2,ma,mp=0,count=0;
		int a[];
		int p[];
		while(s.hasNext()){
			n=s.nextInt();
			a=new int[n+1];
			p=new int[n+1];
			for(i=0;i<=n;i++){
				a[i]=i;
			}
			ma=a[n];
			
			while(mp*mp<ma){
				if(a[m]!=0){
					p[k]=a[m];
					for(i=2;(p[k]*i)<=n;i++){//
						a[p[k]*i]=0;
					}
					ma=max(a);
					mp=max(p);
					k++;
				}
				m++;
			}//while
			
			for(i=2;i<=n;i++){
				if(a[i]!=0)
					count++;
			}
			System.out.println(count);
			k=0;m=2;mp=0;count=0;
		}//has while

	}
}