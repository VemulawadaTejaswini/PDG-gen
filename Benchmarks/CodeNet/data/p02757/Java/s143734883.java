import java.util.Arrays;
import java.util.Scanner;

class Main{
	static long N,P;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//DPっぽい
		N=sc.nextLong();
		P=sc.nextLong();
		String s=sc.next();
		long[][] renDP = new long[(int)N][(int)P];		//剰余のテーブル
		long cut= 0;
		for(int i=0; i<N; i++) {
			Arrays.fill(renDP[i],0);
		}
		renDP[0][(s.charAt(0)-'0')% ((int)P)] ++;
		if(N == 1) {
			//
		}
		else {
			for(int i=1; i<N; i++) {
				int num = s.charAt(i)-'0';
				for(int j=0; j<P; j++) {
					renDP[i][((int)((j*10 + num)% P))] += renDP[i-1][j];
					if(j  == 0) {
						cut +=renDP[i-1][j];
					}
				}
				renDP[i][(int)(num % P)]++;
			}
		}
		pl(renDP[(int)N-1][0] + cut);
		//output(renDP);
		//output(cutDP);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}public static void p(Object o) {
		System.out.print(o);
	}
	/*public static void output(long[][] a) {
		for(int j=0; j<P; j++) {
			for(int i = 0 ; i < N ; i++) {
				p(a[i][j]+" ");
			}
			pl(a[N][j]);
		}
	}*/
}