import java.util.Scanner;

public class Main {
	public static void main(String[] age){
		String s = new Scanner(System.in).nextLine();
		String p = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int x = 0;
		String a;

		for( i=0 ; i<s.length() ; i++ ){
			if ( (i+p.length())>s.length() ){
				x = (i+p.length())-s.length();
				a = s.substring(i, s.length()) + s.substring(0, x);
			}else{
				a = s.substring(i, i+p.length());
			}
			if( p.equals(a) ){
				j++;
				break;
			}
		}

		if( j==0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}