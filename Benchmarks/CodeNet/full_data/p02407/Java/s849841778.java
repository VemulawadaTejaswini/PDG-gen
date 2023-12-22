import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * ?????°?????£?¨?
		 */
		int n = 0;
		int a = 0;
		int temp = 0;
		String str;
		/**
		 * ???????????£?¨?
		 */
		ArrayList<String> st = new ArrayList<String>();
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		/**
		 * ??\?????¨?????????????´?
		 */
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 0;i < n; ++i){
			st.add(scan.next());
			reverse.add(Integer.parseInt(st.get(i))); //int????????¨int????????????????´?
		}
		for(int j = n; j > 1; --j){
			System.out.print(reverse.get(j-1));
			System.out.print(" ");
		}
		System.out.print(reverse.get(0));
	}

}