import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = arr[2] - arr[1];
		arr[0] += count;
		int add = (arr[2] - arr[0] + 1) / 2;
		if (arr[0] + add * 2 > arr[2]) {
			count++;
		}
		count += add;
		System.out.println(count);
	}
}
