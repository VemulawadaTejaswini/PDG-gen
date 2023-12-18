import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		//Arrays.sort(a);
		long sum=0;
		for(int i=0;i<n-1;i++){
			if((a[i]+a[i+1])>x){
				int m=a[i]+a[i+1]-x;
				int b=a[i+1]-m;
				sum+=m;
				if(b<0){
					a[i+1]=0;
					a[i]+=b;
				}else{
					a[i+1]-=m;
				}
				
			}
		}
		//System.out.println(Arrays.toString(a));
		System.out.println(sum);
		
	}
}
