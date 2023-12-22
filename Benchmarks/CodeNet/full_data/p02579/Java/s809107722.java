import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	int ch = sc.nextInt();
	int cw = sc.nextInt();
	int dh = sc.nextInt();
	int dw = sc.nextInt();

	String li;
	boolean[][] meiro = new boolean[h][w];
	for (int i=0; i<h; i++) {
	    li = sc.next();
	    for (int j=0; j<w; j++) {
		if (li.charAt(j) == '.') meiro[i][j] = true;
		else { meiro[i][j] = false; }
	    }
	}
        if (! canWalk(h,w,ch,cw,meiro)) System.out.print(-1);
	else { System.out.print((Math.abs(ch-dh) + Math.abs(cw-dw))/4); }
    }
    static boolean canWalk(int h,int w,int ch,int cw,boolean[][] meiro) {
	int il = Math.max(0,ch-1);
	int jl = Math.max(0,cw-1);
	int ir = Math.min(h,ch+1);
	int jr = Math.min(w,cw+1);
	boolean re = false;
	for (int i=il; i<=ir; i++) {
	    for (int j=jl; j<=jr; j++) {
		if (!(i==ch && j==cw) && meiro[i][j] == true)
		    re = true;
		    break;
	    }
	}
	return re;
    }
}
