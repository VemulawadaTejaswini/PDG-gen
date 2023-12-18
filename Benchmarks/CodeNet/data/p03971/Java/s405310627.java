import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.nextLine();

		String[] list = S.split("");
		int y = 0;
		int passer = 0;

		for(int i = 1; i <= N; i++ ) {
			if(list[i].equals("a")) {
				if(passer < A + B) {
					System.out.println("Yes");
					passer ++;
				} else {
					System.out.println("No");
				}

			} else if(list[i].equals("b")) {
				y ++;
				if(passer < A + B && y <= B) {
					System.out.println("Yes");
					passer ++;
				} else {
					System.out.println("No");
				}

			} else {
				System.out.println("No");
			}
		}
	}
}
