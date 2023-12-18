import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] mozi = new String[n];
		int count = 0;

		List<String> listA = new ArrayList<String>(Arrays.asList(mozi));
		List<String> listB = new ArrayList<String>(new HashSet<>(listA));

		for(String s:listB) {
			count++;
		}

		System.out.println(count);
	}

}
