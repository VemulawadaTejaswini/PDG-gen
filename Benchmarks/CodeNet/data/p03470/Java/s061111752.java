import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, count;
		count = 0;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int temp = input.nextInt();
			if(!arr.contains(temp)) {
				arr.add(temp);
				count++;
			}
		}
		System.out.println(count);

	}

}
