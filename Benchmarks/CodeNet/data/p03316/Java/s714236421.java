import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */

public class Main {

	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int a = 0;
		int b = N;
		int s = 0;
		
		while(true){
			a = b % 10;
			b = b / 10;
			s += a;
			if(b == 0) break;
		}
		
		System.out.println((N % s == 0) ? "Yes" : "No");
	}
}