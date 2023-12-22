import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		while( true ){
			String str = scan.next();
			if( str.equals("-") ){
				break;
			}
			int m = Integer.parseInt(scan.next());
			for( int i = 0; i < m; i++ ){
				str = Shuffle(str, Integer.parseInt(scan.next()));
			}
			System.out.println(str);
		}
	}
	
	public static String Shuffle(String s, int h){
		String s1, s2;
		s1 = s.substring(0, h);
		s2 = s.substring(h, s.length());
		s = s2 + s1;
		return s2 + s1;
	}
}