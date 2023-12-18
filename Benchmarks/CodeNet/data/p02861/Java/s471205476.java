import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		double x, y;

		Node(String line) {
			String[] tokens = line.split(" ");
			this.x = Double.parseDouble(tokens[0]);
			this.y = Double.parseDouble(tokens[1]);
		}

		double distance(Node n) {
			return Math.sqrt(Math.pow(this.x - n.x, 2.0) + Math.pow(this.y - n.y, 2.0));
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<Node> nodes = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			nodes.add(new Node(in.readLine()));
		}
		List<Double> dists = new ArrayList<>();
		for (int i = 0; i < nodes.size(); ++i) {
			List<Node> list = new ArrayList<>(nodes.size());
			list.addAll(nodes);
			list.remove(i);
			dists.addAll(calcDistance(nodes.get(i), list));
		}
		System.out.println(calcAve(dists));
	}

	static double calcAve(List<Double> doubles) {
		double result = 0.0;
		for (int i = 0; i < doubles.size(); ++i) {
			result += doubles.get(i);
		}
		return result / (double) doubles.size();
	}

	static List<Double> calcDistance(Node first, List<Node> remain) {
		if (remain.size() == 1) {
			List<Double> result = new ArrayList<>();
			result.add(first.distance(remain.get(0)));
			return result;
		} else {
			List<Double> result = new ArrayList<>();
			for (int i = 0; i < remain.size(); ++i) {
				List<Node> list = new ArrayList<>(remain.size());
				list.addAll(remain);
				list.remove(i);
				List<Double> distList = calcDistance(remain.get(i), list);
				double first2next = first.distance(remain.get(i));
				for (int j = 0; j < distList.size(); ++j) {
					distList.set(j, distList.get(j) + first2next);
				}
				result.addAll(distList);
			}
			return result;
		}
	}

}