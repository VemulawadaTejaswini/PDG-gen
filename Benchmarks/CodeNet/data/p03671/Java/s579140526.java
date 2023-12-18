import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(scanner.nextInt());
		arr.add(scanner.nextInt());
		arr.add(scanner.nextInt());
	    Collections.sort(arr);
		System.out.println(arr.get(0) + arr.get(1));
	}
}
