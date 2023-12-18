import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result;
		for(result = 1; result <= N; result *= 2) {
			if(result * 2 > N ) {
				break;
			}
		}
		System.out.println(result);
	}
}
