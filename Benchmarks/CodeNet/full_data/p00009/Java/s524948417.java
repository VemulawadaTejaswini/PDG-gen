import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				int n = Integer.parseInt(str);

				int[] arr = createArray(n);

				for(int i = 2; i <= n; i++){
					for(int j = 2; n >= i * j; j++){
						arr[i*j] = -1;
					}
				}

				System.out.println(countArray(arr));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}

	private static int[] createArray(int number){
		int[] arr = new int[number + 1];
		arr[0] = arr[1] = -1;
		for(int i = 2; i <= number; i++){
			arr[i] = i;
		}
		return arr;
	}

	private static int countArray(int[] arr){
		int count = 0;
		for(int n : arr)if(n != -1)count++;
		return count;
	}

}