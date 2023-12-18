import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int count = 0;
		int idx = 0;
		while (idx < arr.length - 2) {
			if (arr[idx] == 'A' && arr[idx + 1] == 'B' && arr[idx + 2] == 'C') {
				count++;
				arr[idx] = 'B';
				arr[idx + 1] = 'C';
				arr[idx + 2] = 'A';
				for (int i = idx - 1; i >= 0; i--) {
					if (arr[i] == 'A') {
						count++;
						arr[i] = 'B';
						arr[i + 1] = 'C';
						arr[i + 2] = 'A';
					} else {
						break;
					}
				}
			}
			idx++;
		}
		System.out.println(count);
	}
}
