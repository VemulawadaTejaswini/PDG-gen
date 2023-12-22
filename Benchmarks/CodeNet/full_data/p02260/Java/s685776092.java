import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String input_str[] = br.readLine().split("\\s+");
			int[] array = new int[n];
			for(int i=0; i < n; i++) {
				array[i] = Integer.parseInt(input_str[i]);
			}
			int work, minj, sw = 0;
			for(int i=0; i<n; i++) {
				minj = i;
				work = array[i];
				for(int j=i+1; j<n; j++) {
					if(array[minj] > array[j]) {
						minj = j;
					}
				}
				if(i != minj) {
					array[i] = array[minj];
					array[minj] = work;
					sw++;
				}
			}
			output(array);
			System.out.println(sw);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	private static void output(int[] array) {
		System.out.printf("%d", array[0]);
		for (int i=1; i<array.length; i++) {
			System.out.printf(" %d", array[i]);
		}
		System.out.printf("\n");
	}

}

