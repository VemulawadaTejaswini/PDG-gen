import java.util.*;

class Main{
	public static void main(String[] $){
		hoge
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt(),m=s.nextInt();
		int[]a=new int[n],b=new int[m];
		int[][]f=new int[n][m];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.setAll(b,i->s.nextInt());
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<m;++j) {
				f[i][j]=Math.min(a[i],b[j]);
			}
		}
		
		System.err.println(n*m);
		
		Arrays.stream(f).forEach(o->System.out.println(Arrays.toString(o)));
	}
}