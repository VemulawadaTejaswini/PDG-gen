import java.util.Scanner;

public class Main{
	static int n, k;
	static int[] w;
	static boolean ok(int p) {
		int tw=0, tc=1;
		for(int i=0; i<n; i++) {
			if(tw+w[i]<=p) {
				tw+=w[i];
			}
			else if(w[i]<=p){
				tc++;
				tw=w[i];
			}
			else {
				return false;
			}
		}
		return (tc<=k)? true:false;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			k=sc.nextInt();
			w=new int[n+1];
			for(int i=0; i<n; i++) {
				w[i]=sc.nextInt();
			}
			int l=0, h=1000000000;
			while(l+1<h) {//積みきれない最大値がある範囲[l, h)
				int m=(l+h)/2;
				if(ok(m)) {//積みきれる場合
					h=m;
				}
				else {
					l=m;
				}
			}
			System.out.println(h);

		}
	}
}
