import java.util.Scanner;

//D
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int max = M / N; // 最大値 （切り捨て

		for(int i = max; 1 <= max; i--) {
			if(M % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}