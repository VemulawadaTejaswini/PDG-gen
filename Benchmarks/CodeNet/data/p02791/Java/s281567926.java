import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int count = 1;
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			p[i] = j;
		}
		for (int i = 0; i < n - 1; i++) {
			if (p[i] > p[i + 1])
				count++;
		}
		System.out.println(count);
		kb.close();
	}

}
