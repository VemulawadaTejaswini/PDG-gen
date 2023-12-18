import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		for(int i=1; i<=10; i++) {
			System.out.println(r*x - D);
			x = r*x - D;
		}
	}
}
