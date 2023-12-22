import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		String ans = "No";
		
		if(s.length() == t.length()-1 && s.equals(t.substring(0, t.length()-1))) {
			ans = "Yes";
		}
		
		System.out.println(ans);
	 }

}
