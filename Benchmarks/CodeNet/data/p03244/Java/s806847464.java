
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[] = new int[t];
		int i = 0;
		while (t-- > 0)
			arr[i++] = scan.nextInt();

		HashMap<Integer, Integer> hm = new HashMap<>();
		int co = 0, mx = 0;
		for (i = 0; i < arr.length; i += 2) {
			co++;
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
			mx = mx < hm.get(arr[i]) ? hm.get(arr[i]) : mx;
		}
		int even = co - mx;
		co = 0;
		mx = 0;
		for (i = 1; i < arr.length; i += 2) {
			co++;
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
			mx = mx < hm.get(arr[i]) ? hm.get(arr[i]) : mx;
		}
		int odd = co - mx;
		System.out.println(even + odd);
	}

}