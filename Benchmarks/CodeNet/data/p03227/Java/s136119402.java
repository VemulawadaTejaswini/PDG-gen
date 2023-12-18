import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		if (arr.length == 3) {
			char tmp = arr[0];
			arr[0] = arr[2];
			arr[2] = tmp;
		}
		System.out.println(arr);
	}
}
