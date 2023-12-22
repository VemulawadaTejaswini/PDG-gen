import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {		
		String the = "the";
		String that = "that";
		String thisString = "this"; 
		String tmpthe = "";
		String tmpthis = "";
		String tmpthat = "";
		int shift_num = 0;

		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		String input = scanner.next();
		//		System.out.println(input);
		for(int i=0; i<26; i++){
			tmpthe = shift("the", i);
			tmpthis = shift("this", i);
			tmpthat = shift("that", i);
			//			System.out.println(input.startsWith(tmpthe) + " " + input.startsWith(tmpthis) + " " + input.startsWith(tmpthat));
			//			System.out.println(tmpthe + " " + tmpthis + " " + tmpthat);
			if((input.startsWith(tmpthe)) || (input.startsWith(tmpthis)) || (input.startsWith(tmpthat))){
				shift_num = i;
				break;
			}
		}
		//		System.out.println("みっけた " + shift_num + " よっしゃ");
		System.out.println(shiftR(input, shift_num));
	}

	public static String shift(String s, int num){
		String tmp = "";
		int sub = 'z' - 'a';
		for(int i=0; i<s.length(); i++){
			if((s.charAt(i)+num%26) > 'z'){
				tmp = tmp + String.valueOf((char)(s.charAt(i)+(num%26)-'z'+'a'-1));
			}else{
				tmp = tmp + String.valueOf((char)((s.charAt(i)+num%26)));
			}
		}
		return tmp;
	}

	public static String shiftR(String s, int num){
		String tmp ="";
		for( int i=0; i<s.length(); i++){
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				tmp = tmp + String.valueOf((char)(s.charAt(i)-num));
			}else{
				tmp = tmp + String.valueOf((char)(s.charAt(i)));
			}
		}
		return tmp;
	}
}