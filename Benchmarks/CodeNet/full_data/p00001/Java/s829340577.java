
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Long> height = new ArrayList<Long>();

		for (int i = 0; i < 10; i++) {
			String str = br.readLine();
			height.add(Long.valueOf(str));
		}

		Collections.sort(height, new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {
				int ret = 0;
				if (o1 > o2) {
					ret = -1;
				} else if (o1 < 02) {
					ret = 1;
				}
				return ret;
			}
		});

		for (int i = 0; i < 3; i++) {
			System.out.println(height.get(i));
		}

	}

}

