
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;
			int cnt2 = 0,cnt5 = 0;
			for (int i = 1; i <=n ; i++) {
				cnt2+=factorCnt(i,2);
				cnt5+=factorCnt(i,5);
			}
			out.println(Math.min(cnt2, cnt5));
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}

	static int factorCnt(int n,int r){
		int cnt = 0;
		while(n%r==0){
			cnt++;
			n/=r;
		}
		return cnt;
	}
}