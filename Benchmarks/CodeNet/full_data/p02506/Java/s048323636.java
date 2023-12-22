import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();	
		int count = 0;
		String nowword = null;
		
		while(sc.hasNext()) {
			nowword = sc.next();
			
			//if(isEqualStr(word, sc.next())) count++;
			if(nowword.matches(word)) count++;
			if(nowword.matches("END_OF_TEXT")) break;
		}
		
		System.out.println(count);
	}
	
}