import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long V = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long W = Long.parseLong(sc.next());
		long T = Long.parseLong(sc.next());

		if(B-A == 0) {
			System.out.println("YES");
			return;
		}

		if(V-W == 0) {
			System.out.println("NO");
			return;
		}

		if(B>A) {
			System.out.println( (V-W) * T >= Math.abs(B-A) ? "YES":"NO");
		} else {
			System.out.println((W-V) * T >= Math.abs(A-B) ? "YES":"NO");
		}
	}
}
