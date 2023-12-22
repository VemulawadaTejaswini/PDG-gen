import java.io.BufferedReader;
import java.io.InputStreamReader;
//ツ挿ツ禿シツソツーツト
//public class Problem0018_SortingFiveNumbers {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0018_SortingFiveNumbers test = new Problem0018_SortingFiveNumbers();
			Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				try {
					String[] textArray = line.split(" ");
					int[] numbers = new int[5];
					for(int i = 0; i < numbers.length; i++) {
						numbers[i] = Integer.parseInt(textArray[i]);
					}
					test.sort(numbers);
					for(int i = 0; i < numbers.length-1; i++) {
						System.out.print(numbers[i] + " ");
					}
					System.out.println(numbers[numbers.length-1]);
				} catch(Exception e) {
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	/*
		Problem0018_SortingFiveNumbers test = new Problem0018_SortingFiveNumbers();
		for(int i = 0; i < 200; i++) {
			int[] array = new int[5];
			for(int j = 0; j < array.length; j++) {
				array[j] = (int)(Math.random() * 100);
			}
			test.shuffle(array);
			for(int number : array) {
				System.out.print(number +" ");
			}
			System.out.println();
			test.sort(array);
			for(int number : array) {
				System.err.print(number +" ");
			}
			System.err.println();
		}
	*/
	}
	void sort(int[] array) {
		int[] numbers = array;
		for(int i = 1; i < numbers.length; i++) {
			for(int j = i; j > 0; j--) {
				if(numbers[j-1] < numbers[j]) {
					int temporary = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temporary;
				} else {
					break;
				}
			}
		}
	}
	void shuffle(int[] targetArray) {
		int[] array = targetArray;
		for(int i = 0; i < array.length; i++) {
			int position = (int)(Math.random() * (i+1));
			
			int temporary = array[position];
			array[position] = array[i];
			array[i] = temporary;
		}
	}
}