import java.util.Scanner;
public class Main {
    static LCS lcs;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int q = Integer.parseInt(scan.nextLine());
	String x, y;
	for (int i = 0; i < q; i++) {
	    x = scan.nextLine();
	    y = scan.nextLine();
	    lcs = new LCS(x, y);
	    lcs.runFindlcs();
	}
    }
}
class LCS {
    String x;
    String y;
    int[][] lcs;
    LCS (String x, String y) {
	this.x = x;
	this.y = y;
	lcs = new int[x.length()+1][y.length()+1];
    }
    void runFindlcs () {
	for (int i = 0; i < x.length(); i++) {
	    for (int j = 0; j < y.length(); j++) {
		if (x.charAt(i) == y.charAt(j)) {
		    lcs[i+1][j+1] = lcs[i][j] + 1;
		} else {
		    lcs[i+1][j+1] = Math.max(lcs[i][j+1], lcs[i+1][j]);
		}
	    }
	}
	System.out.println(lcs[x.length()][y.length()]);
    }
    
}