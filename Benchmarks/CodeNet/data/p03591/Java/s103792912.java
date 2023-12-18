import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		String S = sc.next();

		if(S.charAt(0) == 'Y' && S.charAt(1) == 'A' && S.charAt(2) == 'K' && S.charAt(3) == 'I'){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}


		//out.close();
	}
}