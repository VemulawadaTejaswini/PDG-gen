import java.util.*;
// warm-up
// Solution ripped from editorial. Knew the solution. Just couldnt know what the bounds were.
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), n=B, i=1;
		while (n-->0) {
			if ((C%B==((i*A)%B))) {
				System.out.println("YES"); System.exit(0);
			}
			i++;
		}
		System.out.println("NO");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}