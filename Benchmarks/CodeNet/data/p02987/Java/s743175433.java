
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "No" ;
		String[] ss = s.split("");

		if(ss[0].equals(ss[2]) && ss[3].equals(ss[1])) {
			ans = "Yes";
		}
		if(ss[0].equals(ss[1]) && ss[3].equals(ss[2])) {
			ans = "Yes";
		}
		if(ss[0].equals(ss[3]) && ss[1].equals(ss[2])) {
			ans = "Yes";
		}
		System.out.println(ans);
		sc.close();
	}
}
