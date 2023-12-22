import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		read().stream().map(data -> data.getRequiredNumber()).forEach(System.out::println);
	}

	static List<DataSet> read() {
		Scanner scanner = new Scanner(System.in);
		List<DataSet> dataList = new ArrayList<>();
		while (true) {
			int length = scanner.nextInt();
			if (length == 0) {
				break;
			} else {
				DataSet dataSet = new DataSet();
				for (int i = 0; i < length; i++) {
					dataSet.add(parse(scanner.next()), parse(scanner.next()));
				}
				dataList.add(dataSet);
			}
		}
		scanner.close();
		return dataList;
	}

	static int parse(String str) {
		return Integer.parseInt(str.replaceAll(":", ""));
	}

	static class DataSet {
		private Map<Integer, Integer> timeline = new HashMap<>();

		void add(int departure, int arrival) {
			timeline.merge(departure, 1, (a, b) -> a + b);
			timeline.merge(arrival, -1, (a, b) -> a + b);
		}

		int getRequiredNumber() {
			List<Integer> timestamps = timeline.keySet().stream().sorted().collect(Collectors.toList());
			int i = 0, max = 0;
			for (int timestamp : timestamps) {
				i = i + timeline.get(timestamp);
				max = Math.max(max, i);
			}
			return max;
		}
	}
}