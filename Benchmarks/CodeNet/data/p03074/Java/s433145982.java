import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());
	String str = sc.next();
	Color[] col = new Color[str.length()+3];
	int locnt = 0;
	int collen = 0;
	char prec = str.charAt(0);
	if(N == 1) {
	    if(str.equals("1"))
		System.out.println(1);
	    else {
		if(K>=1) System.out.println(1);
		else System.out.println(0);
	    }
	    return;
	}
	for(int i = 0; i<str.length(); i++) {
	    char c = str.charAt(i);
	    if(c != '0' && i == 0) {
		col[collen] = new Color('0', 0);
		collen++;
	    }
	    if(c == prec) locnt++;
	    else {
		col[collen] = new Color(prec, locnt);
		locnt = 1;
		collen++;
		//System.out.println(col[collen-1].col + " " + col[collen-1].cnt);
	    }
	    if(i == str.length()-1) {
		col[collen] = new Color(c, locnt);
		collen++;
		//System.out.println(col[collen-1].col + " " + col[collen-1].cnt);
	    }
	    prec = c;
	}

	int bcnt = 0;
	int[] ans = new int[collen+1];
	int[] b = new int[collen+1];
	locnt = 0;
	int anscnt = 1;
	for(int i = 0; i<collen; i++) {
	    locnt += col[i].cnt;
	    if(col[i].col == '1') {
		b[anscnt] = col[i].cnt;
		ans[anscnt] = locnt;
		if(anscnt>=1) ans[anscnt] += ans[anscnt-1];
		anscnt++;
		locnt = 0;
		//System.out.println("b " + b[anscnt-1] + " ans " + ans[anscnt-1]);

	    }
	    else if(i==collen-1) {
		ans[anscnt] = locnt;
		if(anscnt>=1) ans[anscnt] += ans[anscnt-1];
		anscnt++;
		//System.out.println("b " + b[anscnt-1] + " ans " + ans[anscnt-1]);
	    }
	}

	int max = 0;
	for(int i = K; i<anscnt; i++) {
	    max = Math.max(ans[i]-ans[i-K] + b[i-K], max);
        }
	System.out.println(max);

    }
}
class Color {
    char col;
    int cnt;
    Color(char col, int cnt) {
	this.col = col;
	this.cnt = cnt;
    }
}