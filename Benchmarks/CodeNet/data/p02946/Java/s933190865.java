import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int m=s.nextInt();

		StringBuilder sb=new StringBuilder();
		for(int i=m-n+1;i<=m+n-1;++i) {
			sb.append(i).append(' ');
		}
		System.out.println(sb);
	}
}
