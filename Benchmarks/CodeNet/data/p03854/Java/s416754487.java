import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb = new StringBuilder(S);
		String newS = sb.reverse().toString();
		String ans1 = newS.replace("remaerd", "0");
		String ans2 = ans1.replace("maerd", "0");
		String ans3 = ans2.replace("resare", "0");
		String ans4 = ans3.replace("esare", "0");
		String ans = ans4.replace("0", "");
		System.out.println(ans.equals("") ? "YES" :"NO");
	}
}