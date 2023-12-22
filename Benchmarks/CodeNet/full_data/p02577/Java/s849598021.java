import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		String[] s = stdIn.next().split("");
		
		long a = 0;
		for(int i = 0; i < s.length; i++) {
			a += Integer.parseInt(s[i]);
		}
		if(a % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		

	}

}
