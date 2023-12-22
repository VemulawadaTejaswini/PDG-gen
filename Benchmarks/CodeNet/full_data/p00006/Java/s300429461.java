import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer strr = new StringBuffer(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			strr.append(str.substring(i, i+1));
		}
		System.out.println(strr);
	}

}