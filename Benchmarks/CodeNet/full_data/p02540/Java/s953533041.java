import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	class City {
		int index, x, y;

		public City(int x, int y, int index) {
			this.x = x;
			this.y = y;
			this.index = index;
		}
	}

	private int getMax(int[] l, int index) {

		int ans = 0;
		for (int i = index; i > 0; i -= i & (-i)) {
			ans += l[i];
		}

		return ans;
	}

	private void updateMax(int[] l, int index, int val) {

		for (int i = index; i < l.length; i++) {
			l[i] += val;
		}
	}

	public void getNumberOfReachableCities(int input) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (input == 1) {
			br = new BufferedReader(new FileReader("test.txt"));
		}
		
		int n = Integer.parseInt(br.readLine());
		int[] ans = new int[n];

		List<City> cities = new ArrayList<City>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			cities.add(new City(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i));
		}

		cities.sort((City c1, City c2) -> c1.x - c2.x);

		int[] left = new int[n + 1];
		int[] right = new int[n + 1];

		for (int i = 0; i < n; i++) {
			int num = getMax(left, cities.get(i).y);
			ans[cities.get(i).index] = num + 1;
			updateMax(left, cities.get(i).y + 1, 1);
		}

		for (int i = n - 1; i >= 0; i--) {
			int num = getMax(right, n - cities.get(i).y + 1);
			ans[cities.get(i).index] += num;
			updateMax(right, n - cities.get(i).y + 2, 1);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(ans[i] + " ");
		}
		// System.out.print(ans[n - 1] + " ");
	}

	public static void main(String[] args) throws Exception {

		Main a = new Main();

		a.getNumberOfReachableCities(0);

	}
}