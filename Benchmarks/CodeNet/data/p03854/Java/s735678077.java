import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = S.replace("eraser", "")
				.replace("erase", "")
				.replace("dreamer", "")
				.replace("dream", "");
		System.out.println(ans.equals("") ? "YES" :"NO");
	}
}