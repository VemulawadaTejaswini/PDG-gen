import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] p = new int[n];
	int[] c = new int[n];
	for (int i=0; i<n; i++) p[i]=sc.nextInt()-1;
	for (int i=0; i<n; i++) c[i]=sc.nextInt();
	long max = -1 * Long.MAX_VALUE;
	for (int i=0; i<n; i++) { //スタートの升目
	    long nowScore = 0;
	    int nowMe = i;
	    for (int j=1; j<=k; j++) { //移動の回数
		nowScore += (long)c[p[nowMe]];
		nowMe = p[nowMe];
		if (nowScore > max) max = nowScore;
	    }
	}
	System.out.print(max);
    }
}
