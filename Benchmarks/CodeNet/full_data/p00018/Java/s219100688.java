import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			if(null != (tmpString = bf.readLine())){
				String[] tmp = tmpString.split(" ");
				int count = tmp.length;
				int[] numbers = new int[count];
				for(int i = 0; i < count; i++){
					numbers[i] = Integer.parseInt(tmp[i]);
				}

				int[] ans = quickSort(numbers);
				for(int i = 0; i < count; i++){
					if(i != 0)System.out.print(" ");
					System.out.print(ans[i]);
				}
				System.out.println("");
			}
		} catch (IOException e) {
		}
	}

	private static int[] quickSort(int[] numbers){
		int count = numbers.length;
		for(int i = 0; i < count - 1; i++){
			for(int j = i + 1; j < count; j++){
				if(numbers[i] < numbers[j]){
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}

		}
		return numbers;
	}
}