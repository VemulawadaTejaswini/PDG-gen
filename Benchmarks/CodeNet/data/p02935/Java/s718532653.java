import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.sort(a);

		double r=a[0];
		for(int i=1;i<n;++i)
			r=(r+a[i])*0.5;
		System.out.println(r);
	}
}
