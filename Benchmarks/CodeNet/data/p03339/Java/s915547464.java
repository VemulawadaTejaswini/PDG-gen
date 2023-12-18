import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 */

public class Main {

	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
      /*
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		System.out.println("***ファイル入力***");
        */

		Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	String S = sc.next();

    	int min = 0;
    	for(int i = 1; i < N; i++){
			if(S.charAt(i) == 'E'){
				min++;
			}

		}

    	int d = min;
    	for(int i = 1; i < N; i++){
    		if(S.charAt(i-1) == 'W') d++;
    		if(S.charAt(i) == 'E') d--;
    		if(d < min) min = d;
    	}

    	System.out.println(min);

	}
}