import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
 
		ArrayList<Long> array = new ArrayList<>();
 
		for (int i = 0; i < n; i++) {
			array.add(sc.nextLong());
		}
 
		long sum = 0;
		for (int j = 0; j < n - 1; j++) {
			long diff = array.get(j) - array.get(j + 1);
			if (diff > 0) {
				sum += diff;
				array.set(j + 1, array.get(j + 1) + diff);
			}
		}
 
		System.out.println(sum);
 
	}
}