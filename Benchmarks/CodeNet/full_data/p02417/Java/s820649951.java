import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		final int ALPHABET = 26;
		int count;
		char c, lca = 97, ucl = 65;
		String ch;
		int data[] = new int[ALPHABET];
		
		//データの初期化
		Arrays.fill(data, 0);
		
		ch = scan.nextLine();
		
		for (int i = 0; i < ALPHABET; i++) {
			count = 0;
			for (int j = 0; j < ch.length(); j++) {
				c = ch.charAt(j);
				if( lca == c || ucl == c) {
					count++;
				}
				
			}
			
			System.out.println(lca + " : " + count);
			lca++;
			ucl++;
		}
		
		
	}
}

