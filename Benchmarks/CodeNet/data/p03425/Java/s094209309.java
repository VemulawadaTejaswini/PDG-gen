import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	Map<Character, List<String>> map;
	long result = 0;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		map = new HashMap<>();
		map.put('M', new ArrayList<>());
		map.put('A', new ArrayList<>());
		map.put('R', new ArrayList<>());
		map.put('C', new ArrayList<>());
		map.put('H', new ArrayList<>());
		for (int i = 0; i < N; ++i) {
			String S = in.readLine();
			if (map.containsKey(S.charAt(0))) {
				map.get(S.charAt(0)).add(S);
			}
		}
	}

	long get(char key0, char key1, char key2) {
		return (long) map.get(key0).size() * (long) map.get(key1).size() * (long) map.get(key2).size();
	}

	void calc() {
		result += get('M', 'A', 'R');
		result += get('M', 'A', 'C');
		result += get('M', 'A', 'H');
		result += get('M', 'R', 'C');
		result += get('M', 'R', 'H');
		result += get('M', 'C', 'H');
		result += get('A', 'R', 'C');
		result += get('A', 'R', 'H');
		result += get('A', 'C', 'H');
		result += get('R', 'C', 'H');
		System.out.println(result);
	}

	void showResult() {
	}
}
