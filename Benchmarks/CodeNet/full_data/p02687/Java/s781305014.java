import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		if (arr[1] == 'R') {
		    arr[1] = 'B';
		} else {
		    arr[1] = 'R';
		}
		System.out.println(arr);
	}
}
