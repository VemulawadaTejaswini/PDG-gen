

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int A=gi();
	    int B=gi();
	    long[] V=new long[N];

        for (int i=0; i< N;i++) {
        	V[i]=gl();
        }
        Arrays.sort(V);

        double avg=0;
        for(int i=N-1; i>=N-A; i--) {
        	avg+=V[i];
        }
        avg=avg/(double)A;

        long ans=0;
        long m=V[N-A];
        int p=0;
        int q=0;
        for(int i=0; i<N;i++) {
        	if(V[i]==m) {
        		p++;
        		if(i>=N-A)q++;
        	}
        }

        if(avg==m) {
            for (int i=q; i<=Math.min(p, B); i++) {
            	ans+=combi(p, i);
            }
        } else {
        	ans=combi(p, q);
        }

        System.out.println(avg);
        System.out.println(ans);
	}

	// ｎ個の中からm個選ぶ組み合わせの数
		public static long combi(int n, int m) {
			int ind=Math.max(n, m)+1;
			long[][] C=new long[ind][ind];
			for(int i=0; i<ind;i++) {
				C[i][0]=1;
			}

			for (int i=2; i<=n+m;i++) {
				for (int j=1; j<i;j++) {
					if(j<ind && i-j<ind) {
				        C[j][i-j]=C[j-1][i-j-1]+C[j-1][i-j];
					}
				}
			}
			return C[n][m];
		}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}