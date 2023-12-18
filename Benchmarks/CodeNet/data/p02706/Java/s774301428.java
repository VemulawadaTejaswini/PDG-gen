import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int sum=0;
		
		for(int i=0;i<M;i++) {
			sum+=input.nextInt();
		}
		if (sum > N) {
			System.out.println("-1");
		} else {
			System.out.println(N - sum);
		}
	}
}
