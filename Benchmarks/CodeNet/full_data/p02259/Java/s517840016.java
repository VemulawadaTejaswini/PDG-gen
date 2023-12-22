import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] strArray = br.readLine().split(" ");
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(strArray[i]);
		}
		
		int count = bubbleSor(array, n);
		
		printArray(array);
		System.out.println(count);
		
	}
	
	static int bubbleSor(int[] array, int n){
		int flag = 1;
		int count = 0;
		while(flag == 1){
			flag = 0;
			for(int j = n - 1; j >= 1; j--){
				if(array[j] < array[j - 1]){
					int tmp = array[j];
					array[j]  = array[j - 1];
					array[j - 1] = tmp;
					flag = 1;
					count++;
				}
			}
		}
		
		return count;
	}
	
	static void printArray(int[] array){
		for(int i = 0; i < array.length ;i++){
			System.out.print(array[i]);
			if(i != array.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}