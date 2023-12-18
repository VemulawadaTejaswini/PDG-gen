import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int X, Y, Z;
	long K;
	List<Long> A, B, C;
	List<Long> values;
	static long LIMIT = 100000;
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
		this.values = new ArrayList<>();
		if (X * Y * Z <= LIMIT) {
			for (int x = 0; x < X; ++x) {
				for (int y = 0; y < Y; ++y) {
					for (int z = 0; z < Z; ++z) {
						this.values.add(this.A.get(x) + this.B.get(y) + this.C.get(z));
					}
				}
			}
			Collections.sort(this.values, this.comp);
		} else {
			int[] initIndexes = { 0, 0, 0, -1 };
			long base = this.A.get(initIndexes[0]) + this.B.get(initIndexes[1]) + this.C.get(initIndexes[2]);
			this.values.add(base);
			while (this.values.size() <= LIMIT) {
				base = this.A.get(initIndexes[0]) + this.B.get(initIndexes[1]) + this.C.get(initIndexes[2]);
				if (initIndexes[3] != 0) {
					for (int x = initIndexes[0] + 1; x < X; ++x) {
						long sub = this.A.get(initIndexes[0]) - this.A.get(x);
						this.values.add((base - sub));
					}
				}
				if (initIndexes[3] != 1) {
					for (int y = initIndexes[1] + 1; y < Y; ++y) {
						long sub = this.B.get(initIndexes[1]) - this.B.get(y);
						this.values.add((base - sub));
					}
				}
				if (initIndexes[3] != 2) {
					for (int z = initIndexes[2] + 1; z < Z; ++z) {
						long sub = this.C.get(initIndexes[2]) - this.C.get(z);
						this.values.add((base - sub));
					}
				}
				// initIndexesを更新
				initIndexes = updateInitIndexes(initIndexes);
				if (this.values.size() >= X * Y * Z) {
					break;
				}
			}
			Collections.sort(this.values, this.comp);
		}
	}

	int[] updateInitIndexes(int[] indexes) {
		int[] result = Arrays.copyOf(indexes, indexes.length);
		int target = -1;
		long diff = Long.MAX_VALUE;
		if (indexes[0] + 1 < this.X) {
			if (diff > this.A.get(indexes[0]) - this.A.get(indexes[0] + 1)) {
				diff = this.A.get(indexes[0]) - this.A.get(indexes[0] + 1);
				target = 0;
			}
		}
		if (indexes[1] + 1 < this.Y) {
			if (diff > this.B.get(indexes[1]) - this.B.get(indexes[1] + 1)) {
				diff = this.B.get(indexes[1]) - this.B.get(indexes[1] + 1);
				target = 1;
			}
		}
		if (indexes[2] + 1 < this.Z) {
			if (diff > this.C.get(indexes[2]) - this.C.get(indexes[2] + 1)) {
				diff = this.C.get(indexes[2]) - this.C.get(indexes[2] + 1);
				target = 2;
			}
		}
		if (target >= 0) {
			result[target]++;
		}
		result[3] = target;
		return result;
	}

	void show() {
		for (int i = 0; i < this.K; ++i) {
			System.out.println(this.values.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		ins.show();

	}

}