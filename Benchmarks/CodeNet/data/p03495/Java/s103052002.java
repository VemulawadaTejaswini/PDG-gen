import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String sl[] = str.split(" ");
		int n = Integer.parseInt(sl[0]);
		int k = Integer.parseInt(sl[1]);

		str = sc.nextLine();
		sl = str.split(" ");
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i < n; i++)
		{
			int x = Integer.parseInt(sl[i]);
			m.put(x, m.containsKey(x) ? m.get(x) + 1 : 1);
		}

		ArrayList<Integer> list = new ArrayList<>(m.values());
		Collections.sort(list);
		int e = 0;
		int s = list.size();
		for(int i = 0; i < s - k; i++)
		{
			e += list.get(i);
		}
		System.out.println(e);
	}
}