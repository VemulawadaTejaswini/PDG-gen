import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=1<<s.nextInt(),inf=999999999;
		int[]v=new int[n];
		Arrays.fill(v,inf);

		for(int m=s.nextInt();m>0;--m){
			int w=s.nextInt(),f=0;
			for(int k=s.nextInt();k>0;--k)
				f|=1<<(s.nextInt()-1);
			v[f]=Math.min(v[f],w);
		}

		for(int i=2;i<n;++i)
			for(int j=1;j<i;++j)
				v[i|j]=Math.min(v[i|j],v[i]+v[j]);

		System.out.println(v[n-1]<inf?v[n-1]:-1);
	}
}
