import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	for(int tc = 0; tc < N; ++tc) {
	    int[] len = new int[3];
	    for(int i = 0; i < 3; ++i) {
		len[i] = s.nextInt();
	    }
	    Arrays.sort(len);
	    if(len[0]*len[0] + len[1]*len[1] == len[2]*len[2]) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
}