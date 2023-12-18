import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();

		if(S.equals(U)) A--;
		else if(T.equals(U)){
			B--;
		}

		System.out.printf("%d %d",A,B);
		sc.close();
	}

}
