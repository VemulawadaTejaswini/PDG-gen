import java.util.Scanner;

public class Main {
	static int[] x = new int[2000];
	static int L;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		L=sc.nextInt();
		N=sc.nextInt();

		x[0]=0;
		for(int i=1;i<=N;i++) {
			x[i]=sc.nextInt();
			//System.out.println(x[i]);
		}

		int l=1,r=N;
		int k=0;

		int ans=0;
		int p=0;
		boolean nowL=true;
		while(k<N) {


			if(nowL) {
				if( Math.abs( x[l]-x[p] ) > Math.abs(x[p]-righter(r)) ) {

					ans+=Math.abs(x[l]-x[p]);
					p=l;
					l++;
					k++;
					nowL=true;
//					System.out.print("LL");
				} else {

					ans+=Math.abs( x[p]-righter(r) );
					p=r;
					r--;
					k++;
					nowL=false;
//					System.out.print("LR");
				}
			} else {
				if( Math.abs( x[l]-righter(p) ) > Math.abs(righter(p)-righter(r)) ) {

					ans+=Math.abs(x[l]-righter(p));
					p=l;
					l++;
					k++;
					nowL=true;
//					System.out.print("RL");
				} else {

					ans+=Math.abs(righter(p)-righter(r));
					p=r;
					r--;
					k++;
					nowL=false;
//					System.out.print("RR");
				}
			}
//			System.out.println(p+"  "+ans);
		}
		System.out.println(ans);
	}

	static int righter(int i) {
		return -(L-x[i]);
	}

}
