import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[1001];
		for(int i=1;i<=n;i++){
			int b=i;
			int j=2;
			while(b!=1){
				if(b%j==0){
					a[j]++;
					b/=j;
				}else{
					j++;
				}
			}
			
			
		}
		long sum=1;
		
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<=1000;i++){
			if(a[i]!=0){
				sum*=(a[i]+1);
			}
			sum%=1000000007;
		}
		System.out.println(sum);
		
		
	}

}