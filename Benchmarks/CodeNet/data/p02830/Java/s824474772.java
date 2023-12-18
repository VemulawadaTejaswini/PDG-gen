import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();

		String ans = "";

		for(int i=0;i<N;i++) {
			ans += Character.toString(s[i]);
			ans += Character.toString(t[i]);
		}
		System.out.println(ans);
	}
}