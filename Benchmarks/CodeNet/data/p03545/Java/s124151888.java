import java.io.File;
import java.io.IOException;
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
	
	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		
		//Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int len = s.length();
		
		for(int i = 0; i <= 0b111; i++){
			int sum = 0;
			String ans = "";
			sum += Integer.valueOf(""+s.charAt(0));
			ans += s.charAt(0);
			for(int j = 2; j >= 0; j--){
				if((1&(i>>j)) == 1){
					sum -= Integer.valueOf(""+s.charAt(3-j));
					ans += "-" + s.charAt(3-j);
				}else{
					sum += Integer.valueOf(""+s.charAt(3-j));
					ans += "+" + s.charAt(3-j);
				}
			}
			
			if(sum == 7){
				ans += "=7";
				System.out.println(ans);
				break;
			}
		}
	}

}