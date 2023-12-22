import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int K = sc.nextInt();
		
		int magic = 0;
		while(B<=A) {
			magic++;
			B*=2;
		}
		while(C<=B) {
			magic++;
			C*=2;
		}
		System.out.println(magic<=K ? "Yes" : "No");
		sc.close();
	}
}
