import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sdata;
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		int[] use = new int[31];
		while (!"0,0".equals(sdata = in.next())) {
			String[] adata = sdata.split(",");
			int point = Integer.parseInt(adata[1]);
			data.put(Integer.parseInt(adata[0]), point);
			if (use[point] == 0) {
				use[point] = 1;
			}
		}
		int rank = 1;
		for (int i = 30; i >= 0; i--) {
			if (use[i] == 1) {
				use[i] = rank++;
			}
		}
		while (in.hasNext()) {
			System.out.println(use[data.get(in.nextInt())]);
		}
	}
}