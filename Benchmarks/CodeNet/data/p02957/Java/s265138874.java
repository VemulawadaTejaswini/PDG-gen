import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int dif = Math.abs(A-B);
		int ans;
		
		if(dif%2 == 0) {
			ans = Math.max(A, B)-dif/2;
			System.out.println(ans);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}