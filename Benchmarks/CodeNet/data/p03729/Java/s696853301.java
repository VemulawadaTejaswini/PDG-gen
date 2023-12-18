import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String endA = A.substring(A.length(), A.length() - 1);
		String startB = B.substring(1,0);
		String endB = B.substring(B.length(), B.length() - 1);
		String startC = C.substring(1, 0);
		if(endA.equals(startB) && endB.equals(startC)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
