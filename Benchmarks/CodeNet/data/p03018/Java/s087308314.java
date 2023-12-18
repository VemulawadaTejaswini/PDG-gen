import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		long countA = 0;
		long count = 0;
		int idx = 0;
		while (idx < arr.length - 2) {
			if (arr[idx] == 'A') {
				countA++;
			} else {
				countA = 0;
				idx++;
				continue;
			}
			if (arr[idx] == 'A' && arr[idx + 1] == 'B' && arr[idx + 2] == 'C') {
				count += countA;
				countA--;
				arr[idx + 2] = 'A';
				idx += 2;
			} else {
				idx++;
			}
		}
		System.out.println(count);
	}
}
