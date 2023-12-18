import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		sc.close();
		String ans = "No";
		for(int i = 0;i < A;i++) {
			if((N - i)%500 == 0) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}