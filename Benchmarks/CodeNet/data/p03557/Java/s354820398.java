import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Main myself = new Main();
		Set<Object> answerSet = myself.execute();

		System.out.print(answerSet.size());
	}

	/**
	 * 実処理メソッド
	 */
	public Set<Object> execute() {

		final List<String> lines = readStdin();

		final InputData inputData = parse(lines);

		Set<Object> answerSet = new HashSet<>();

		for (Integer a : inputData.ArrayA) {

			for (Integer b : inputData.ArrayB) {

				if (!(a < b)) {
					continue;
				}

				for (Integer c : inputData.ArrayC) {

					if (!(b < c)) {
						continue;
					}

					if (a < b && b < c) {
						final Unit myUnit = new Unit(a,b,c);
						answerSet.add(myUnit);
					}
				}

			}
		}

		return answerSet;

	}

	/**
	 * @return
	 */
	private List<String> readStdin() {
		List<String> lines = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)).lines()
				.collect(Collectors.toList());
		return lines;
	}

	/**
	 * @param inputlines
	 * @return
	 */
	private InputData parse(List<String> inputlines) {

		InputData data = new InputData();

		String line1 = inputlines.get(0);
		String line2 = inputlines.get(1);
		String line3 = inputlines.get(2);
		String line4 = inputlines.get(3);

		data.N = Integer.parseInt(line1.trim());

		String[] line2_strarray = line2.split(" ");
		String[] line3_strarray = line3.split(" ");
		String[] line4_strarray = line4.split(" ");

		for (String a : line2_strarray) {
			data.ArrayA.add(Integer.parseInt(a));
		}

		for (String b : line3_strarray) {
			data.ArrayB.add(Integer.parseInt(b));
		}

		for (String c : line4_strarray) {
			data.ArrayC.add(Integer.parseInt(c));
		}

		return data;
	}

	/**
	 * 
	 *
	 */
	private class InputData implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -6938809350516466787L;

		public int N = 0;

		public List<Integer> ArrayA = new ArrayList<>();
		public List<Integer> ArrayB = new ArrayList<>();
		public List<Integer> ArrayC = new ArrayList<>();
	}
	
	/**
	 * 
	 *
	 */
	private class Unit implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 6884978599619621376L;
		
		public int A = 0;
		public int B = 0;
		public int C = 0;
		
		public Unit(int A, int B, int C) {
			super();
			this.A = A;
			this.B = B;
			this.C = C;
		}
		
	}

}
