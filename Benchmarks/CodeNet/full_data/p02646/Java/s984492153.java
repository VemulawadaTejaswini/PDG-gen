import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int V = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());

		if(B-A == 0) {
			System.out.println("YES");
			return;
		}

		if(V-W == 0) {
			System.out.println("NO");
			return;
		}

		if(B>A) {
			System.out.println(Math.abs(B-A) / (W-V) <= T ? "YES":"NO");
		} else {
			System.out.println(Math.abs(A-B) / (V-W) <= T ? "YES":"NO");
		}
	}
}
