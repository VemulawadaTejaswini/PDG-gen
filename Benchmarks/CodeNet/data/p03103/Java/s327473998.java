import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String args[]) {

		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			// ----- input -----
			final int L1[] = readLine(input.readLine());
			final int N = L1[0];
			final int M = L1[1];

			// 1.final int DATA[][] = lines(input.lines(), ROW, COL);
			// 2.final int DATA[][] = readLines(input, N);
			// 2.List<int[]> DATA_LIST = new LinkedList<>(Arrays.asList(DATA));
			PriorityQueue<Data> data = getCollection(input, N, 2);

			// ----- main -----
			long totalPrice = 0;
			int calcCnt = 0;
			int totalCnt = 0;

			while(true) {
				Data min = data.poll();
				calcCnt = (M >= totalCnt + min.num) ? min.num : M-totalCnt;
				totalPrice += (long)min.price * (long)calcCnt;
				totalCnt += calcCnt;
				if(M <= totalCnt) break;
			}
			System.out.println(totalPrice);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	private static PriorityQueue<Data> getCollection(BufferedReader input, int num, int col) {

		PriorityQueue<Data> data = new PriorityQueue<>();
		try {
			for(int i=0; i < num; i++) {
				data.add(new Data(input.readLine().split(" ")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}









	private static int[] readLine(String line) {

		String[] vals = line.split(" ");
		int[] data = new int[vals.length];
		int i = 0;

		try {
			for(String val : vals) {
				data[i++] = Integer.parseInt(val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	private static int[][] readLines(BufferedReader input, int num){

		int[][] data = new int[num][];
		for(int i=0; i < num; i++) {
			try {
				data[i] = readLine(input.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}



class Data implements Comparable<Data>{
	int price;
	int num;

	public Data(String[] values) {
		this.price = Integer.parseInt(values[0]);
		this.num = Integer.parseInt(values[1]);
	}

	@Override
	public int compareTo(Data d) {
		return price - d.price;
	}
}