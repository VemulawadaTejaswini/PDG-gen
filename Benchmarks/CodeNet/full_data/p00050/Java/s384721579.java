import java.util.*;

public class Main {
	public static void main(String[] args){
		String str = "" , all = "";
		boolean Eflag = false;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			str = sc.next();
			String tmp = "";
			char c;
			for ( int i = 0; i < str.length(); i++ ) {
				c = str.charAt(i);
				if ( c != '.' )
					tmp += str.charAt(i);
				else  Eflag = true;
			}
			if ( tmp.equals("apple") )
				tmp = "peach";
			else if ( tmp.equals("peach") )
				tmp = "apple";
			if ( Eflag == true ) {
				all += tmp+".";
				Eflag = false;
			}else
				all += tmp+" ";
		}
		System.out.println(all);
	}
}