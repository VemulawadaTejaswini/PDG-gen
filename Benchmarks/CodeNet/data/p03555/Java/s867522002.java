import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		String s1 = stdIn.next();
		String s2 = stdIn.next();
		
		if(s1.charAt(0) == s2.charAt(2) && s1.charAt(1) == s2.charAt(1) && s1.charAt(2) == s2.charAt(0))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		

	}

}
