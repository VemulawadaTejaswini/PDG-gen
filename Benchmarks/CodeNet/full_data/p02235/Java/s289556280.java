import java.util.Scanner;

public class Main {
	
	int[][] array;

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		String first;
		String second;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			first = in.next();
			second = in.next();
			//System.out.printf("First: %s, Second: %s\n", first, second);
			main.fillArray(first, second);
			//main.printArray();
		}

	}
	
	public void startArray(String first, String second) {
		array = new int[first.length() + 1][second.length() + 1];
		array[0][0] = 0;
		for (int i = 1; i <= first.length(); i++)
			array[i][0] = 0;
		for (int i = 1; i <= second.length(); i++)
			array[0][i] = 0;
	}
	
	public void fillArray(String first, String second) {
		startArray(first, second);
		for (int i = 1; i <= first.length(); i++) {
			for (int j = 1; j <= second.length(); j++)
				fillSpot(first, second, i, j);
		}
		System.out.println(array[first.length()][second.length()]);
	}
	
	public void fillSpot(String first, String second, int i, int j) {
		int hightest = (array[i-1][j] > array[i][j-1])? array[i-1][j] : array[i][j-1];
		String firstLetter = first.substring(i-1, i);
		String secondLetter = second.substring(j-1, j);
		//System.out.printf("Pair: (%s, %s) \n", firstLetter, secondLetter);
		if (firstLetter.equals(secondLetter)) {
			array[i][j] = array[i-1][j-1] + 1;
		} else {
			array[i][j] = hightest;
		}
		
	}
	
	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}

