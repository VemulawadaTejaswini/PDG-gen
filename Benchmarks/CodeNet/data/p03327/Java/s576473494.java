import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;
		N = sc.nextInt();

		if(N < 1000) {
			if(N < 10) {
				System.out.println("ABC00" + N);
			}else if(N < 100) {
				System.out.println("ABC0" + N);
			}else {
				System.out.println("ABC" + N);
			}
		}else {
			if(N < 1010) {
				System.out.println("ABD00" + (N - 1000 + 1));
			}else if(N < 1100) {
				System.out.println("ABD0" + (N - 1000 + 1));
			}else {
				System.out.println("ABD" + (N - 1000 + 1));
			}
		}
	}
}