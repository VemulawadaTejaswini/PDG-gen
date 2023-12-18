import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		int K = Integer.parseInt(c);

		for(int i = 1; i <= K; i++)
			if(A > 0) {
			A = A-1;
			}else {
			B = B-1;
			}
		}
	}

