import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int N,Y;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		Y = scan.nextInt();

		for(int a = 0; a <= N; a++) {
			for(int b = 0; b <= N - a; b++) {
				int c = N - a - b;
				int total = 10000 * a + 5000 * b + 1000 * c;
				if(total == Y) {
					System.out.println("10000円札" + a + "枚、" + "5000円札" + b + "枚、"
				+ "1000円札" + c + "枚");
					System.exit(0);
				}
			}
		}
		System.out.println("-1 -1 -1");
		scan.close();
	}
}
