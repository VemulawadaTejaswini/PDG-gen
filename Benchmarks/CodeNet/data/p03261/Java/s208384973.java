import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<String> word = new ArrayList<String>();

		for(int i = 0; i < n; i++) {
			word.add(sc.next());
		}

		for(String wordContain1:  word) {
			int count = 0;
			for(String wordContain2 : word) {
				if(wordContain1.equals(wordContain2)){
					count++;
				}
			}
			if(count > 1) {
				System.out.println("No");
				return;
			}
		}

		for(int i = 0; i < n - 1; i++) {
			String str1 = word.get(i);
			String str2 = word.get(i + 1);

			String str1l = str1.substring(str1.length() - 1);
			String str2f = str2.substring(0,1);

			if(!(str1l.equals(str2f))) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");


	}
}