import java.util.*;
import java.io.*;

public class Main {  // クラス名はこれで固定。
    static Scanner in;
    static PrintWriter out;
    static void solve() {
	int N = in.nextInt();
	String S = in.next();
	int lCnt = 0;
	int rCnt = 0;
	for (int i = 0; i < N; i++) {
	    if (S.charAt(i) == '(') {
		lCnt++;
	    } else {
		rCnt++;
	    }
	}

	if (lCnt > rCnt) {
	    rCnt = lCnt - rCnt;
	    lCnt = 0;
	} else {
	    lCnt = rCnt - lCnt;
	    rCnt = 0;
	}

	for (int i = 0; i < lCnt; i++) {
	    S = "(" + S;
	}
	for (int i = 0; i < rCnt; i++) {
	    S = S + ")";
	}
	out.println(S);
    }

    public static void main(String[] args) {
	in = new Scanner(System.in);
	out = new PrintWriter(System.out);
	solve();
	out.flush();
	out.close();
	in.close();
    }
}
