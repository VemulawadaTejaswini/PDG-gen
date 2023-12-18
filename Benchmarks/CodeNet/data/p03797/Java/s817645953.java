import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		List<Integer> inputArr = new ArrayList<Integer>();
		
		for (String s : input) {
			inputArr.add(Integer.parseInt(s));
		}
		
		int n = inputArr.get(0); //S
		int m = inputArr.get(1); //C
		int res = 0;
		if (n > m / 2) {
			res = m / 2;
		}
		else {
			res = n + (m - n * 2) / 4;
		}
		
		System.out.println(res);
	}
}