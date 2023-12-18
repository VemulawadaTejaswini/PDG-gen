import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int A = Integer.parseInt(spl[0]);
		int P = Integer.parseInt(spl[1]);
		sc.close();
		int sum = A * 3 + P;
		int applePie = 0;
		applePie = sum /2;
		System.out.println(applePie);
	}
}