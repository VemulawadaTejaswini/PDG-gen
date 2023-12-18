import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> as = new ArrayList<>();
		for (int i=0; i<n; i++) {
			as.add(scanner.nextInt());
		}
		Collections.sort(as);

		int max = as.get(n-1);
		int half = max/2;
		int guuki = max%2;
		for (int i=0; i<=half; i++) {
			if (as.contains(half-i)) {
				System.out.println(max + " " + (half-i));
				break;
			}else if (as.contains(half+i+guuki)) {
				System.out.println(max + " " + (half+i+guuki));
				break;
			}
		}
	}

}