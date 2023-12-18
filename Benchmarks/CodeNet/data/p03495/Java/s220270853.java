import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ss = br.readLine().split(" ", 2);
		int n = Integer.parseInt(ss[0]);
		int k = Integer.parseInt(ss[1]);
		String[] arr = br.readLine().split(" ", n);
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0 && !arr[i - 1].equals(arr[i])) {
				list.add(count);
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 0) {
			list.add(count);
		}
		
		Collections.sort(list);
		int total = 0;
		while (list.size() > k) {
			total += list.get(0);
			list.remove(0);
		}
		System.out.println(total);
	}
}
