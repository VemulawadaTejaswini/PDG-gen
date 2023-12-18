import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
//		String s = sc.next();
		int i = 0;
		while(true) {

			if(Math.abs(A-i)==Math.abs(B-i))break;
			if(i == Integer.MAX_VALUE) {

				System.out.println("IMPOSSIBLE");
				return;
			}

			i++;
		}

		System.out.println(i);


	}

}
