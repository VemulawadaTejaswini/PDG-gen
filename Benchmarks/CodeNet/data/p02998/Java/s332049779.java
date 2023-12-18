import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	Map<Integer, List<Integer>> xFirstPoints;
	Map<Integer, Set<Integer>> xFirstPointSet;
	Map<Integer, List<Integer>> yFirstPoints;
	Map<Integer, Set<Integer>> yFirstPointSet;
	long count = 0;

	Main(List<String> lines) {
		this.xFirstPoints = new HashMap<>();
		this.yFirstPoints = new HashMap<>();
		this.xFirstPointSet = new HashMap<>();
		this.yFirstPointSet = new HashMap<>();
		for (int i = 0; i < lines.size(); ++i) {
			String[] tokens = lines.get(i).split(" ");
			int x = Integer.parseInt(tokens[0]);
			int y = Integer.parseInt(tokens[1]);
			if (!this.xFirstPoints.containsKey(x)) {
				this.xFirstPoints.put(x, new ArrayList<>());
			}
			if (!this.xFirstPointSet.containsKey(x)) {
				this.xFirstPointSet.put(x, new HashSet<>());
			}
			this.xFirstPoints.get(x).add(y);
			this.xFirstPointSet.get(x).add(y);
			if (!this.yFirstPoints.containsKey(y)) {
				this.yFirstPoints.put(y, new ArrayList<>());
			}
			if (!this.yFirstPointSet.containsKey(y)) {
				this.yFirstPointSet.put(y, new HashSet<>());
			}
			this.yFirstPoints.get(y).add(x);
			this.yFirstPointSet.get(y).add(x);
		}
		for (Integer key : this.xFirstPoints.keySet()) {
			Collections.sort(this.xFirstPoints.get(key));
		}
		for (Integer key : this.yFirstPoints.keySet()) {
			Collections.sort(this.yFirstPoints.get(key));
		}

		calc();
		System.out.println((count/2));
	}

	void calc() {
		List<Integer> yValues = new ArrayList<>();
		yValues.addAll(yFirstPoints.keySet());
		Collections.sort(yValues);
		for (int i = 0; i + 1 < yValues.size(); ++i) {
			int ySmall = yValues.get(i);
			for (int j = i + 1; j < yValues.size(); ++j) {
				int yLarge = yValues.get(j);
				Set<Integer> set = new HashSet<>();
				set.addAll(yFirstPoints.get(yLarge));
				set.retainAll(yFirstPointSet.get(ySmall));
				if (!set.isEmpty()) {
					Set<Integer> total = new HashSet<>();
					total.addAll(yFirstPoints.get(yLarge));
					total.addAll(yFirstPoints.get(ySmall));
					count += total.size() - set.size();
				}
			}
		}
		List<Integer> xValues = new ArrayList<>();
		xValues.addAll(xFirstPoints.keySet());
		Collections.sort(xValues);

		for (int i = 0; i + 1 < xValues.size(); ++i) {
			int xSmall = xValues.get(i);
			for (int j = i + 1; j < xValues.size(); ++j) {
				int xLarge = xValues.get(j);
				Set<Integer> set = new HashSet<>();
				set.addAll(xFirstPoints.get(xLarge));
				set.retainAll(xFirstPointSet.get(xSmall));
				if (!set.isEmpty()) {
					Set<Integer> total = new HashSet<>();
					total.addAll(xFirstPoints.get(xLarge));
					total.addAll(xFirstPoints.get(xSmall));
					count += total.size() - set.size();
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<String> lines = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			lines.add(in.readLine());
		}
		Main ins = new Main(lines);

		in.close();
	}

}
