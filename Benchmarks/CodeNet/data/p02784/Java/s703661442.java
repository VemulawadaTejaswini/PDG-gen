import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int power[] = new int[N];
		int totalPower = 0;

		for(int i = 0 ;i <= N-1 ;i++) {
			power[i] = sc.nextInt();
			totalPower = totalPower + power[i];
		}
		System.out.println((totalPower>=H)? "Yes":"No");
	}
}

