import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		if(s.equals("AAA")||s.equals("BBB")) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}
}
