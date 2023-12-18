
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(String.format("%.0f", Math.ceil((double)(B-1)/(A-1))));
	}
}
