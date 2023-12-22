import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> array = new ArrayList<>();
		long sum=0;

		for(int i=0; i<n; i++) {
			array.add(sc.nextInt());
			sum +=array.get(i);
		}
		Collections.sort(array);
		System.out.println(array.get(0) + " "+ array.get(n-1) + " " + sum);
	}
}
