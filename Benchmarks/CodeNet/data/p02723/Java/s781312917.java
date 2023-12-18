import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String ans = "No";
		
		if(s[2].equals(s[3]) && s[4].equals(s[5])) {
			ans = "Yes";
		}
		
		System.out.println(ans);
		}
}