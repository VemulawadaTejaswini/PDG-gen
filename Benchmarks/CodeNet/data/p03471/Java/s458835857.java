import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int Y = cin.nextInt();
		cin.close();

		for (int x=0; x<=N; x++) {
			for (int y=0; y<=N-x; y++) {
				int total = 10000*x + 5000*y + (N-x-y)*1000;
				if (total == Y) {
					System.out.println(x+" "+y+" "+(N-x-y));
					System.exit(0);
				}
			}
		}
		
		System.out.println("-1 -1 -1");
	}

}