import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int result = 0;
		for (int i=0; i<6; i++){
			if (S.substring(i, i+1).equals("1")){
				result++;
			}
		}
		System.out.println(result);
	}
}
