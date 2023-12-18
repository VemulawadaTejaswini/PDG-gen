import java.util.*;

public class Main{

	static final int mod=1000000007;

	static long[]	dp	=new long[(2<<20)+1];
	static long[]	r	=new long[(2<<20)+1];

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int[] v=new int[n];
		{
			int t=0;
			for(int i=0;i<n;++i){
				v[i]=t^=Integer.parseInt(s.next());
				//System.err.println(v[i]);
			}
		}
		if(v[n-1]!=0) {
			System.out.println("1");
			return;
		}
		System.err.println();
	}
}