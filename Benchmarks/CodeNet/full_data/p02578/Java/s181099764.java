import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int stool = 0;
		int max = 1;
		for (int i = 0; i < n; i++) {
			int next = in.nextInt();
			stool += Math.max(0, max - next);
			max = Math.max(max, next);
		}
		
		System.out.println(stool);
		
		in.close();
	}
}
