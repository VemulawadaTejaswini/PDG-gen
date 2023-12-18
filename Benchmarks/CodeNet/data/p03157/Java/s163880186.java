import java.util.*;
class Main {
    static int cnt;
    static int H;
    static int W;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	H = sc.nextInt();
	W = sc.nextInt();
	char[][] b = new char[H][W];
	for(int i= 0; i<H;i++) {
	    String str = sc.next();
	    for(int j = 0; j<W; j++) {
		b[i][j] = str.charAt(j);
	    }
	}
	for(int i = 0; i<H; i++) {
	    for(int j = 0; j<W; j++) {
		if(b[i][j] =='#') {
		    char[][] cb = copyB(b);
		    countWhite(cb,i,j);
		}
	    }
	}
	System.out.println(cnt);

    }
    public static void printB(char[][] b) {
	for(int i = 0; i<b.length; i++) {
	    for(int j = 0; j<b[i].length; j++) {
		System.out.print(b[i][j]);
	    }
	    System.out.println();
	}
    }
    public static char[][] copyB(char[][] b) {
	char[][] cb = new char[H][W];
        for(int i = 0; i<b.length; i++) {
            for(int j = 0; j<b[i].length; j++) {
                cb[i][j] = b[i][j];
            }
        }
	return cb;
    }
    public static void countWhite(char[][] b, int i, int j) {
	char target = (b[i][j]=='#')?'.':'#';

	if(b[i][j] == '.') {
	    cnt++;
	}
	b[i][j] = '*';
	if(i+1<H) {
	    if(b[i+1][j] == target) {
		countWhite(b,i+1,j);
	    }
	}
	if(i-1>=0) {
	    if(b[i-1][j] == target) {
		countWhite(b,i-1,j);
            }
	}
        if(j+1<W) {
            if(b[i][j+1] == target) {
		countWhite(b,i,j+1);
            }
        }
	if(j-1>=0) {
            if(b[i][j-1] == target) {
		countWhite(b,i,j-1);
            }
	}

    }

}