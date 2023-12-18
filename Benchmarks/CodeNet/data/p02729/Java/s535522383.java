import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int count = n * (n - 1) / 2 + m * (m - 1) / 2;
		System.out.println(count);
		kb.close();
	}

}
