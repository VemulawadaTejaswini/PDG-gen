//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long x=sc.nextInt();
		long ans=x+(n-x)+2*x;
		long left=n-2*x;
		while(x>=0)
		{
			x=x-left;
			ans=ans+left;
		}
		System.out.println(ans);

	}

}
