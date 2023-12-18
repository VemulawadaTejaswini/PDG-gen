import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('s', sc.nextInt());
		map.put('p', sc.nextInt());
		map.put('r', sc.nextInt());
		char[] arr = sc.next().toCharArray();
		int total = 0;
		for (int i = 0; i < n; i++) {
		    if (i >= k && arr[i] == arr[i - k]) {
		        arr[i] = 'x';
		    } else {
		        total += map.get(arr[i]);
		    }
		}
		System.out.println(total);
	}
}
