import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray();
		char[]t=s.next().toCharArray();
		int n=a.length;
		int[][]next=new int[26][n];

		for(int i=0;i<26;++i)
			Arrays.fill(next[i],Integer.MAX_VALUE/2);
		for(int i=0;i<n;++i)
			next[a[i]-'a'][i]=0;

		for(int k=n*2-2;k>=0;--k) {
			int i=k%n;
			int j=(i+1)%n;
			for(int c=0;c<26;++c)
				next[c][i]=Math.min(next[c][i],next[c][j]+1);
		}

		//Arrays.stream(next).map(Arrays::toString).forEach(System.err::println);

		long r=1;
		int index=0;
		int m=t.length;
		for(int i=0;i<m;++i) {
			int v=next[t[i]-'a'][index];
			if(v>=10000000) {
				System.out.println(-1);
				return;
			}
			r+=v;
			//System.err.println(r+" "+index);
			index+=v;
			index%=n;
		}
		System.out.println(r);
	}
}
