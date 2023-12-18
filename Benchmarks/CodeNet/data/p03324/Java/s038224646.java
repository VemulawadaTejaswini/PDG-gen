import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();

		if(N != 100) {
			int answer = (int)(N * Math.pow(100, D));
			System.out.println(answer);
			return;
		}else {
			int answer = (int)(101 * Math.pow(100, D));
			System.out.println(answer);
			return;
		}
	}

}