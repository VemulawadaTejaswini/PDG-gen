import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner can = new Scanner(System.in);
		String kaibun = can.next();
		char bunkai[] = new char[kaibun.length()];
		
		String zenhan = kaibun.substring(0, (kaibun.length() - 1) / 2 );
		String kouhan = kaibun.substring((kaibun.length() - 1)/ 2 + 1);
		
		if(!zenhan.equals(kouhan)) {
			System.out.println("no");
			System.exit(0);
			
		}
		
		String zenhan2 = zenhan.substring(0,(zenhan.length() - 1) / 2);
		String kouhan2 = zenhan.substring((zenhan.length() - 1)/ 2 + 1);
		
		if(!zenhan2.equals(kouhan2)) {
			System.out.println("no");
			System.exit(0);
			
		}

		
	}
	
}