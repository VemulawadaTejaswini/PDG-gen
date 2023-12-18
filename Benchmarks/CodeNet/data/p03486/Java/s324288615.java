import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String t = sc.nextLine();
		List<String> sLis = Arrays.asList(s.split(""));
		List<String> tLis = Arrays.asList(t.split(""));
		/*
		List<String> lines1 = Arrays.asList(line1.split(" "));
		List<String> lines2 = Arrays.asList(line2.split(" "));
		*/
		Collections.sort(sLis);
		Collections.sort(tLis, Comparator.reverseOrder());


		if (sLis.toString().compareTo(tLis.toString()) <= -1   ) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

}