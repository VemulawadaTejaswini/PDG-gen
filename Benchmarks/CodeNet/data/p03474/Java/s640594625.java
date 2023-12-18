import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt(); in.nextLine();
		String s = in.nextLine();
		String ans = "No";
		if( s.contains("-") ) {
			String[] arr = s.split("-");
			if( arr.length == 2 ) {
				if( arr[0].length() == a && arr[1].length() == b ) ans = "Yes";
			}
		}
		System.out.println(ans);
	}

}