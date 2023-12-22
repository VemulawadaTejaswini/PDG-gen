import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		while(in.hasNext()) {
			String[] dataset_str = in.nextLine().split(" ");
			List<Integer> dataset = new ArrayList<>();
			for(int i=0;i<dataset_str.length;i++) {
				dataset.add(Integer.parseInt(dataset_str[i]));
			}
			if(solve(dataset, 0, 0, 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean solve(List<Integer> dataset, int i, int left, int right) {
		if(i == dataset.size()) return true;
		if(dataset.get(i) > left && solve(dataset, i+1, dataset.get(i), right)) {
			return true;
		}
		if(dataset.get(i) > right && solve(dataset, i+1, left, dataset.get(i))) {
			return true;
		}
		return false;
	}
}