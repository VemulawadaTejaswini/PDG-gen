
import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;

		while(true){
			String S = sc.next();

			if(S.equals("END_OF_TEXT")){
				break;
			}

			String text = S.toLowerCase();

			if(text.equals(word)){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}