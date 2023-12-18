import java.util.*;

// ABC 18-C
// http://abc018.contest.atcoder.jp/tasks/abc018_3
 
public class Main {

	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println(group(x) == group(y) ? "Yes" : "No");
	}
	
	public static int group(int n) {
		switch(n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 1;
		case 4:
		case 6:
		case 9:
		case 11:
			return 2;
		default: 
			return 3;
		}
	}
}