import java.util.*;

public class Main{
	static final int dx[]= {0,-1,0,1};
	static final int dy[]= {-1,0,1,0};

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int w=s.nextInt();
		int n=s.nextInt();
		int sy=s.nextInt();
		int sx=s.nextInt();

		int u=sy;
		int d=h-sy+1;
		int l=sx;
		int r=w-sx+1;

		char[]t=s.next().toCharArray(),a=s.next().toCharArray();

		for(int i=0;i<n;++i) {
			if(t[i]=='U')if(--u==0){System.out.println("NO");return;};
			if(t[i]=='D')if(--d==0){System.out.println("NO");return;};
			if(t[i]=='L')if(--l==0){System.out.println("NO");return;};
			if(t[i]=='R')if(--r==0){System.out.println("NO");return;};

			if(a[i]=='U')if(d<h)++d;
			if(a[i]=='D')if(u<h)++u;
			if(a[i]=='L')if(r<w)++r;
			if(a[i]=='R')if(l<w)++l;
		}
		System.out.println("YES");
	}
}