import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int SUM = 1;
		if(A == B && A == C) {
		}else if(A != B && A != C && B != C) {
			SUM = 3;
		}else{
			SUM = 2;
		}
		System.out.print(SUM);
	}
}