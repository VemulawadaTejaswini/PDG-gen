import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		int answer = n;
		for(i = 0; i < d; i++) {
			answer = n * 100;
		}
		/*if(d == 0 && n == 100) {
			answer++;
		}*/
		System.out.println(answer);
	}
}