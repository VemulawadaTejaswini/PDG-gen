

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static boolean[][] saw;
	static char[][] cs;
	static int H;
	static int W;
	static int bl;
	static int wh;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        H=gi();
        W=gi();
        cs=new char[H][W];
        saw=new boolean[H][W];

        for (int i=0; i<H; i++) {
            String s=gs();
            for (int j=0; j<W;j++) {
            	cs[i][j]=s.charAt(j);
            }
        }

        long ans=0;
        for (int i=0; i<H; i++) {
            for (int j=0; j<W;j++) {
            	if(saw[i][j] !=true) {
            		f(i, j, true);
            		ans+=bl*wh;
            		bl=0;
            		wh=0;
            	}
            }
        }

        System.out.println(ans);

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
//        }
	}

	public static void f(int h, int w, boolean isB) {
		char c=cs[h][w];
		if((c=='#' && !isB) || (c=='.' && isB)) return;
		if(isB) {
			bl++;
		} else {
			wh++;
		}
		saw[h][w]=true;

		if(h-1>=0 && !saw[h-1][w]) {
			f(h-1, w, !isB);
		}

		if(w-1>=0 && !saw[h][w-1]) {
			f(h, w-1, !isB);
		}

		if(h+1<H && !saw[h+1][w]) {
			f(h+1, w, !isB);
		}

		if(w+1<W && !saw[h][w+1]) {
			f(h, w+1, !isB);
		}

		return;
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