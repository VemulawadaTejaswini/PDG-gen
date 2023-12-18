import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; ;i++) {
			sum += i;
			if (sum >= X) {
				System.out.println(i);
				break;
			}
		}
	}
}
