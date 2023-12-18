
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int[] A = new int[N];
		int Tokuhyousuu = 0;
		int sum = 0;

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(lines[i]);
//			System.out.println(A[i]);
			sum = sum + A[i];
		}
		Tokuhyousuu = sum / (4 * M);
//		System.out.println(Tokuhyousuu);

		int count = 0;
		boolean Flag = false;
		for(int i = 0; i < A.length; i++) {
			if(A[i] >= Tokuhyousuu) {
				count++;
			}else {

			}

			if(count >= M) {
				Flag = true;
				break;
			}else {

			}
		}

		if(Flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
