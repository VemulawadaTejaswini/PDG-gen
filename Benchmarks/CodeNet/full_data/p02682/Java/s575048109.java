import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int total = 0;
		for(int i = 0;i < K;i++) {
			if(A > 0) {
				total++;
				A--;
			}else if(B > 0) {
				B--;
			}else {
				total--;
				C--;
			}
		}
		System.out.println(total);
	}
}