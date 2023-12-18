import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		
		
		if(S.length() == 2) {
			System.out.println(S);
		}else {
			StringBuffer sb = new StringBuffer(S);
			System.out.println(sb.reverse());
			
		}

	}

}
