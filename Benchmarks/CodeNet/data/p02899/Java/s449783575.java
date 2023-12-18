import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		ArrayList<Pair> p = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			p.add(new Pair(i + 1, Integer.parseInt(str[i])));
		}

		Collections.sort(p);

		System.out.print(p.get(0).id);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + p.get(i).id);
		}
		System.out.println();
	}
}

class Pair implements Comparable<Pair> {
	int id;
	int num;

	public Pair(int id, int num) {
		this.id = id;
		this.num = num;
	}

	@Override
	public int compareTo(Pair p) {
		return this.num - p.num;
	}
}