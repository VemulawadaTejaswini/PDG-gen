import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		int answer = n;
		for(i = 0; i < d; i++) {
			answer = answer * 100;
		}
		if(n == 100) {
			if(d == 0) {
				answer++;
			} else if(d == 1) {
				answer = answer + 100;
			} else if(d == 2) {
				answer = answer + 10000;
			}
		}
		System.out.println(answer);
	}
}