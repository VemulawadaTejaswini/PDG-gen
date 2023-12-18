import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		long m=0;
		long ans=0;
		long sum=0;
		int j=-1;
		int count=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			sum+=a[i];
			if(a[i]<=b[i]){
				ans+=b[i];
				m+=b[i]-a[i];
			}else{
				j=i;
				count++;
			}
		}
		if(ans==sum){
			System.out.println(0);
		}else if(count!=1){
			System.out.println(sum);
		}else{
			if(a[j]-b[j]==m){
				System.out.println(ans);
			}else{
				System.out.println(sum);
			}
		}
	}
}
