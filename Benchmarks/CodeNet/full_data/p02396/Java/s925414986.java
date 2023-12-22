import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int cnt = 1;
		while(a != 0) {
			System.out.println("Case "+ cnt + ": " + a);
			a = sc.nextInt();
			cnt += 1;
		}
		sc.close();
	}

}

