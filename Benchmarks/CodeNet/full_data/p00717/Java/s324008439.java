import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	int[][] mov=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
	public void run() {
		while(true){
			int n=sc.nextInt();

			int size=sc.nextInt();
			int[] d=new int[size-1];
			int[] dir=new int[size-1];
			{
				int xprev=sc.nextInt(),yprev=sc.nextInt();
				for(int i=0;i<size-1;i++){
					int x=sc.nextInt(),y=sc.nextInt();
					if(x==xprev){
						if(y>yprev)dir[i]=1;
						else dir[i]=3;
						d[i]=Math.abs(y-yprev);
					}else{
						if(x>xprev)dir[i]=0;
						else dir[i]=2;
						d[i]=Math.abs(x-xprev);
					}
					xprev=x;yprev=y;
				}
			}
			check:for(int i=1;i<=n;i++){
				int s=sc.nextInt();
				int[] xs=new int[s];
				int[] ys=new int[s];
				for(int j=0;j<s;j++){
					xs[j]=sc.nextInt();
					ys[j]=sc.nextInt();
				}
				if(s!=size)continue;

				for(int D=0;D<4;D++){
					int x=xs[0],y=ys[0];
					boolean ok=true;
					for(int j=0;j<s-1;j++){
						x+=d[j]*mov[(dir[j]+D)%4][0];
						y+=d[j]*mov[(dir[j]+D)%4][1];
						if(x!=xs[j+1] || y!=ys[j+1])
							ok=false;
					}
					if(ok){
						ln(i);
						continue check;
					}
				}
				for(int D=0;D<4;D++){
					int x=xs[0],y=ys[0];
					boolean ok=true;
					for(int j=0;j<s-1;j++){
						x+=d[s-2-j]*mov[(dir[s-2-j]+D)%4][0];
						y+=d[s-2-j]*mov[(dir[s-2-j]+D)%4][1];
						if(x!=xs[j+1] || y!=ys[j+1])
							ok=false;
					}
					if(ok){
						ln(i);
						continue check;
					}
				}

			}
			ln("+++++");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}