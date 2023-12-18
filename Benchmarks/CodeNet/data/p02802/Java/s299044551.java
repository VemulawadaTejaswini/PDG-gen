import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	boolean[] ans = new boolean[n];
	int p;
	String s;
	int countAC = 0;
	int countWA = 0;
	int[] cw = new int[n];
	for (int i=0; i<m; i++) {
	    p = sc.nextInt() - 1;
	    s = sc.next();
	    if (s.equals("AC")) {
		if (ans[p] == false) {
		    countAC++;
		    ans[p] = true;
		    countWA += cw[p];
		}
	    } else {
		cw[p]++;
	    }
	}
	System.out.print(countAC + " " + countWA);
    }
}
