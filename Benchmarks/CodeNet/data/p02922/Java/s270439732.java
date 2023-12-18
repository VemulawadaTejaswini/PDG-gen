import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int t = 0;
		int s = 0;
		while(s < B) {
			s += A;
			t++;
		}
		System.out.println(t);
	}

}