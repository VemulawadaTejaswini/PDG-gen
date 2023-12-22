import java.util.Scanner;

class Main {
	// ABC164 A
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int S = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());


		if(S > W) {
			System.out.println("safe");
		} else {
			System.out.println("unsafe");
		}
	}

}
