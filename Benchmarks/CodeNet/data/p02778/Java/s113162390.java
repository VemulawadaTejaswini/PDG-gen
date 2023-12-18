import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String ans = "";
		for(int i=0;i<S.length();i++) {
			ans += "x";
		}
		System.out.println(ans);
	}

}