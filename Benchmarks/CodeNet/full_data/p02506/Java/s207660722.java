import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		String word, str;
		int c;
		
		word = scr.next();
		c = 0;
		
		 while (true){
			str = scr.next();
			if (str.equals("END_OF_TEXT")) break;
			if (str.equals(word)) c++;
		}
		 System.out.println(c);
		 scr.close();
	}
}