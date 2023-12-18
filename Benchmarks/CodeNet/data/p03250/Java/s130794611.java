import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int max = 0;
		if (A >= B) {
			max = (A >= C) ? A*10+B+C : C*10+A+B;
		} else {
			max = (B >= C) ? B*10+A+C : C*10+B+A;
		}
		
		System.out.println(max);
	}
}