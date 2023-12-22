import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N=Integer.parseInt(sc.next());
		long a = 1;
		for(int i=0;i< N; i++) {
			long b = Long.parseLong(sc.next());
			if(b == 0) {
				System.out.println(0);
				return;
			}
			a *= b;
		}
		if(1000000000000000000L % a > 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(a);
	}
}
