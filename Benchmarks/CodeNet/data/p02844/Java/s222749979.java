import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char[] c=s.next().toCharArray();

		int[] a=new int[n];
		for(int i=n-1;i>=1;--i){
			a[i-1]=1<<f(i,c);
			if(i<n-1)
				a[i-1]|=a[i];
		}

		int[] r=new int[100];

		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				r[f(i,c)*10+f(j,c)]|=a[j];
			}
		}

		int q=0;
		for(int i:r)
			q+=Integer.bitCount(i);
		System.out.println(q);
	}

	private static int f(int i,char[] c){
		return c[i]-'0';
	}
}
