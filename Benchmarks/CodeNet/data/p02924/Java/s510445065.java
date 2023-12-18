import java.util.Scanner;
	import java.util.Arrays;
	public class Main {
		static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n=scn.nextInt();
			if(n%2!=0)
			{
			int a=n/2;
		int sum=(((a-1)*a)/2);
		int neg=(a*(a+1))/2;
		int sum2=((n-1)*n)/2;
		int such=sum2-neg;
		int rem=n%(a+1);
		int ans=such+rem+sum;
		System.out.println(ans);
			}
			else {
				System.out.println(n*(n-1)/2);
			}
		}
	
	}
