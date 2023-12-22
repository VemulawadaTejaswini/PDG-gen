import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();

		int n = stdIn.getValue();
		List<Integer> values = stdIn.getLine();

		bubbleSort(values, n);

		stdIn.close();

	}

	public static void bubbleSort(List<Integer> values, int n) {

		int count = 0;

		for (int i = n; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (values.get(j) > values.get(j + 1)) {
					values.add(j, values.get(j + 1));
					values.remove(j + 2);
					count++;
				}
			}
		}
		StringBuilder output = new StringBuilder();
		for(int k = 0; k < values.size(); k++) {
			output.append(values.get(k) + " ");
		}
		System.out.println(output.delete(output.length()-1, output.length()));
		System.out.println(count);
	}
}