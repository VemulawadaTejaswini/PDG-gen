import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PrintTestCases {
	private static final int ARRAY_MAX = 10000;
	private int[] data = new int[ARRAY_MAX];
	/**
	 * 
	 */
	private static int CNT_NUM = 1;
	
	public PrintTestCases() {
		Arrays.fill(data, 0);
	}
	
	private void read() {
		final int FINISH_NUMBER = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < ARRAY_MAX; i++) {
			try {
				int addNum = Integer.parseInt(br.readLine());
				if (FINISH_NUMBER >= addNum) {
					break;
				}
				data[i] = addNum;
			} catch (IOException e) {
				System.out.println("Input error.");
			}
			
		}
	}
	
	private String toString(int val) {
		return "Case " + (CNT_NUM++) + ":" + val;
	}
	
	public void run() {
		read();
		
		for (int i = 0; i < ARRAY_MAX; i++) {
			if (0 >= data[i]) {
				break;
			}
			System.out.println(toString(data[i]));
		}
	}
}
public class Main {

	public static void main(String[] args) {

		new PrintTestCases().run();
	}

}

