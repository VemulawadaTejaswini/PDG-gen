import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int tap = sc.nextInt();
		int wantNum = sc.nextInt();

		int cnt = 1;
		int tapWant = 0;
		while(cnt < wantNum) {
			tapWant++;
			cnt += (tap - 1);
		}
		System.out.println(tapWant);
	}
}