import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = S.replace("dreameraser", "");
		String ans2 = ans.replace("dreamerase", "");
		String ans3 = ans2.replace("dreamer", "");
		String ans4 = ans3.replace("dream", "");
		String ans5 = ans4.replace("eraser", "");
		String ans6 = ans5.replace("erase", "");
		System.out.println(ans4.equals("") ? "YES" :"NO");
	}
}