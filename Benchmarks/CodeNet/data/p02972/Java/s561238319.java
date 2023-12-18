import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[]q=new int[n];
		Arrays.setAll(q,i->s.nextInt());

		boolean[] a=new boolean[n+1];
		int c=0;

		for(int i=n;i>0;--i) {
			boolean t=q[i-1]==1;
			for(int j=i*2;j<=n;j+=i)
				t^=a[j];
			a[i]=t;
			if(a[i])
				++c;
		}
		System.out.println(c);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;++i)
			if(a[i])
				sb.append(i).append("\n");
		System.out.println(sb);
	}
}
