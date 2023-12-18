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
		boolean answer = false;

		for(int i = 0; i < S.length() - 1; i++){
			if(S.charAt(i) == 'A' && S.charAt(i+1) == 'C'){
				answer = true;
				break;
			}
		}

		if(answer){
		System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		//out.close();
	}
}