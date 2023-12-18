import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 1;
		for(; result <= N; result *= 2) {
		}
		System.out.println(result/2);
	}

}
