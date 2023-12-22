
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String w = stdIn.next();
		int count = 0;
		
		while(true){
			String t = stdIn.next();
			if(t.equals("END_OF_TEXT")){
				break;
			}
			if(w.equals(t)){
				count++;
			}
		}
		
		System.out.println(count);
	}
}