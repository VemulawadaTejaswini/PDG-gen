import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		ArrayManager array = new ArrayManager(n);

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			int x = Integer.parseInt(tmpArray[1]);
			int y = Integer.parseInt(tmpArray[2]);

			if(tmpArray[0].equals("0")){
				array.update(x, y);
			}
			else {
				int result = array.findMin(x, y);
				System.out.println(result);
			}
		}
	}

}

class ArrayManager {
	private int[] array;
	private int n;
	private final int INIT = Integer.MAX_VALUE;

	public ArrayManager(int n){
		this.n = n;
		array = new int[n];

		Arrays.fill(array, INIT);
	}

	public void update(int index, int num){
		array[index] = num;
	}

	public int findMin(int s, int t){
		int min = Integer.MAX_VALUE;

		for(int i = s ; i <= t; i++){
			if(min > array[i]){
				min = array[i];
			}
		}

		return min;
	}
}