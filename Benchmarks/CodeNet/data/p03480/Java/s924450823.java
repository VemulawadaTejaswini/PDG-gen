import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int min = arr.length;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				min = Math.min(min, Math.max(i, arr.length - i));
			}
		}
		System.out.println(min);
	}
}
