import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int r = Integer.parseInt(tmp[0]);
		int d = Integer.parseInt(tmp[1]);
		int x2000 = Integer.parseInt(tmp[2]);
		sc.close();

		int xi = x2000;
		for(int i=0; i<10; i++) {
			xi = r*xi - d;
			System.out.println(xi);
		}
	}
}
