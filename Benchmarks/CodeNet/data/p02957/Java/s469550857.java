import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//　花の数
		int A = sc.nextInt();
		int B = sc.nextInt();
		int dif = Math.abs(A-B);
		
		if(dif%2 == 0) {
			System.out.println(dif/2);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}