import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		for( int i = 0; i < str.length(); i++ ){
			System.out.print(Change(str.charAt(i)));
		}
		System.out.println();
		return;
	}
	
	public static char Change(char c){
		if( 'a' <= (int)c && (int)c <= 'z' ){
			c = (char)((int)c + 'A' - 'a');
		}else if( 'A' <= (int)c && (int)c <= 'Z' ){
			c = (char)((int)c + 'a' - 'A');
		}
		return c;
	}
}