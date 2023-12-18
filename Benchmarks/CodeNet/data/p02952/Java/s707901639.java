import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;
		for(int i = 1; i <= N; i++) {
			int numLen = String.valueOf(i).length();
			if(numLen % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
