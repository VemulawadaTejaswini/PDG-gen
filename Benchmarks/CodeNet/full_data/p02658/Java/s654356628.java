import java.util.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long x;
		double ans = 1;
		for(int i=0;i<n;i++) {
		    x=sc.nextLong();
		    if(ans != -1)
		        ans *=x;
		    if(ans > Math.pow(10, 18) || ans <0) {
		        ans = -1;break;
		    }
		    if(x == 0) {
		        ans = 0;
		        break;
		    }
		}
		System.out.println((long)ans);
	}
}
