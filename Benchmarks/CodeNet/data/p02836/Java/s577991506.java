import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();
		char[] C = S.toCharArray();

		int ans = 0;

		for(int i=0;i<S.length();i++) {
			if(C[i]!=C[S.length()-1-i]) {
				ans ++;
			}
		}
		System.out.println(ans/2);
	}
}