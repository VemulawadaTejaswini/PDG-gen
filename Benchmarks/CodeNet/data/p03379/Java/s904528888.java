import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(s.nextInt());
		}
		ArrayList<Integer> arrCopy = (ArrayList<Integer>) arr.clone();

		for(int j=0;j<n;j++){
			arr.remove(j);
			Collections.sort(arr);
			System.out.println(arr.get((n / 2) - 1));
			arr = (ArrayList<Integer>) arrCopy.clone();
		}
	}
}
