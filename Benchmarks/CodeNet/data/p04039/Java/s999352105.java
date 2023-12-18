import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String no = "";
		for( int i = 0; i < k; i++ ) {
			no += in.nextInt();
		}
		String testString = "^[^"+no+"]+$";
		while(!Integer.toString(n).matches(testString)) n++;
		System.out.println(n);
	}
}