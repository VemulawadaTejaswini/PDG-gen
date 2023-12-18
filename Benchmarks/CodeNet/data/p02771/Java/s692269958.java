import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String kn = "Yes";
		int i = kb.nextInt();
		int j = kb.nextInt();
		int k = kb.nextInt();
		if (i == j && j == k) {
			kn = "No";
		}
		System.out.println(kn);
		kb.close();
	}

}
