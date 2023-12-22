import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int one = Integer.parseInt(s.split(" ")[0]), two = Integer.parseInt(s.split(" ")[1]),
				three = Integer.parseInt(s.split(" ")[2]), four = Integer.parseInt(s.split(" ")[3]),
				five = Integer.parseInt(s.split(" ")[4]), six = Integer.parseInt(s.split(" ")[5]);
		s = scan.nextLine();
		int one2 = Integer.parseInt(s.split(" ")[0]), two2 = Integer.parseInt(s.split(" ")[1]),
				three2 = Integer.parseInt(s.split(" ")[2]), four2 = Integer.parseInt(s.split(" ")[3]),
				five2 = Integer.parseInt(s.split(" ")[4]), six2 = Integer.parseInt(s.split(" ")[5]);
		s = "EEEENEEEENEEEESSSEEEE";
		// int tmpCnt = Integer.parseInt(scan.nextLine());
		// for(int j = 0;j<s.length();j++){
		// String tmpStr = scan.nextLine();
		// int x = Integer.parseInt(tmpStr.split(" ")[0]);
		// int y = Integer.parseInt(tmpStr.split(" ")[1]);
		for (int i = 0; i < s.length(); i++) {
			int tmp;
			if (s.charAt(i) == 'E') {
				tmp = one;
				one = four;
				four = six;
				six = three;
				three = tmp;
			} else if (s.charAt(i) == 'N') {
				tmp = one;
				one = two;
				two = six;
				six = five;
				five = tmp;
			} else if (s.charAt(i) == 'S') {
				tmp = one;
				one = five;
				five = six;
				six = two;
				two = tmp;
			} else if (s.charAt(i) == 'W') {
				tmp = one;
				one = three;
				three = six;
				six = four;
				four = tmp;
			}
			if (one == one2 && two == two2 && three == three2 && four == four2 && five == five2) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		// if(two == y){
		// System.out.println(three);
		// }else if(three == y){
		// System.out.println(five);
		// }else if(four == y){
		// System.out.println(two);
		// }else if(five == y){
		// System.out.println(four);
		// }
		// System.out.println(one);
	}
}
// }

