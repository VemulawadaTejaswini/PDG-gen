import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			int input = scan.nextInt();
			list.add(input);
			
			if (input > max) max = input;
		}
		
		int sum = 0;
		for (int value : list) {
			if (value != max) sum += value;
		}
		
		if (max < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}