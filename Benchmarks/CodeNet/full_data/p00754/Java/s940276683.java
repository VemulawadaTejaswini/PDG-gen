import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			String str = scan.nextLine();
			int circle = 0;	//?????¬??§????????¬??§??§+1????????¬??§??§-1???
			int block = 0;	//?§???¬??§????????¬??§??§+1????????¬??§??§-1???
			boolean ok = true;
			char[] nowRead = new char[1000];
			int k = 0;
			if( str.charAt(0) == '.' ){
				break;
			}
			for( int i = 0; i < str.length(); i++ ){
				char c = str.charAt(i);
				if( c == '(' ){
					circle++;
					k++;
					nowRead[k] = '(';
					continue;
				}
				if( c == ')' ){
					circle--;
					if( circle < 0 || nowRead[k] != '(' ){
						ok = false;
						break;
					}
					nowRead[k] = '\0';
					k--;
					continue;
				}
				if( c == '[' ){
					block++;
					k++;
					nowRead[k] = '[';
					continue;
				}
				if( c == ']' ){
					block--;
					if( block < 0 || nowRead[k] != '[' ){
						ok = false;
						break;
					}
					nowRead[k] = '\0';
					k--;
					continue;
				}
			}
			if( ok ){
				System.out.println("yes");
			}else{
				System.out.println("No");
			}
		}
		return;
	}
}