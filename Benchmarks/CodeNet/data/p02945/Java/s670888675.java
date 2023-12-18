import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(Math.max(Math.max(n+m,n-m),n*m));
	}
}
