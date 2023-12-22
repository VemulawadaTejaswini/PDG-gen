import java.util.Scanner;

public class Main {
	// 2-100
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String mString = in.next();
		if (mString.charAt(mString.length()-1)=='s') {
			System.out.println(mString+"es");
		}else {
			System.out.println(mString+"s");
		}
		
	}

}