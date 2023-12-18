import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;
		for(int a = 0; a <= A; a++) {
			for(int b = 0; b <= B; b++) {
				for(int c = 0; c <= C; c++) {

					int check = 500 * a + 100 * b + 50 * c;
					if(check == X) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}