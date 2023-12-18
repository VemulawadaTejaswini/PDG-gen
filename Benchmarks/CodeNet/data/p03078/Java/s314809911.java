import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int X, Y, Z;
	long K;
	List<Long> A, B, C;
	List<Long> values;
	static long LIMIT = 3000;
	Comparator<Long> comp = new Comparator<Long>() {
		@Override
		public int compare(Long o1, Long o2) {
			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		this.X = Integer.parseInt(tokens[0]);
		this.Y = Integer.parseInt(tokens[1]);
		this.Z = Integer.parseInt(tokens[2]);
		this.K = Long.parseLong(tokens[3]);
		tokens = in.readLine().split(" ");
		this.A = new ArrayList<>(this.X);
		for (int i = 0; i < X; ++i) {
			this.A.add(Long.parseLong(tokens[i]));
		}
		tokens = in.readLine().split(" ");
		this.B = new ArrayList<>(this.Y);
		for (int i = 0; i < Y; ++i) {
			this.B.add(Long.parseLong(tokens[i]));
		}
		tokens = in.readLine().split(" ");
		this.C = new ArrayList<>(this.Z);
		for (int i = 0; i < Z; ++i) {
			this.C.add(Long.parseLong(tokens[i]));
		}
		in.close();
		Collections.sort(this.A, this.comp);
		Collections.sort(this.B, this.comp);
		Collections.sort(this.C, this.comp);
		this.calc();
	}

	void calc() {
		List<Long> subList = new ArrayList<>();
		for (int x = 0; x < X; ++x) {
			for (int y = 0; y < Y; ++y) {
				subList.add(this.A.get(x) + this.B.get(y));
			}
		}
		Collections.sort(subList, this.comp);
		subList = subList.subList(0, Math.min((int) K, subList.size()));

		this.values = new ArrayList<>();
		for (Long sub : subList) {
			for (int z = 0; z < Z; ++z) {
				this.values.add(sub + this.C.get(z));
			}
		}

		Collections.sort(this.values, this.comp);
	}

	void show() {
		for (int i = 0; i < Math.min(this.K, this.values.size()); ++i) {
			System.out.println(this.values.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		ins.show();

	}

}