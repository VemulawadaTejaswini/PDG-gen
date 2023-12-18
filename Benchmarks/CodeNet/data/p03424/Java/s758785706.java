import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			if(sc.next().equals("Y")) {
				System.out.println("Four");
				System.exit(0);;
			}
		}
		System.out.println("Three");
		sc.close();
	}
}
