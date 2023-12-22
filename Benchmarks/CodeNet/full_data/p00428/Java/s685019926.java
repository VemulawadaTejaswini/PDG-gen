import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader buffReader = new BufferedReader(new FileReader("input.txt"));

		//COUNTER
		String[] arrNumbers = buffReader.readLine().split(" ");
		int students = Integer.parseInt(arrNumbers[0]);
		int position = Integer.parseInt(arrNumbers[1]);

		ArrayList<Boolean[]> alIsStudentsLikePosition = new ArrayList<Boolean[]>();

		//INPUT
		for(int i = 0; i < students; i++) {
			String[] arrStrLikePosition = buffReader.readLine().split(" ");
			Boolean[] arrIsLikePosition = new Boolean[position];

			for(int j = 0; j < position; j++) arrIsLikePosition[j] = arrStrLikePosition[j].equals("1");

			alIsStudentsLikePosition.add(arrIsLikePosition);
		}

		//COUNTER
		int[] arrLikeCounter = new int[position];

		for(int i = 0; i < alIsStudentsLikePosition.size(); i++)
			for(int j = 0; j < position; j++)
				arrLikeCounter[j] += alIsStudentsLikePosition.get(i)[j] ? 1 : 0;

		//SORT
		int arrLength = arrLikeCounter.length;
		int counter1 = 0, counter2 = 0;
		while(0 < arrLength) {
			boolean isDone = false;
			int i = 1;
			counter1++;

			while(i < arrLength) {
				if(arrLikeCounter[i] < arrLikeCounter[i - 1]) {
					counter2++;
					int tmp = arrLikeCounter[i - 1];
					arrLikeCounter[i - 1] = arrLikeCounter[i];
					arrLikeCounter[i] = tmp;

					isDone = true;
				}
				i++;
			}
			if(!isDone) break;
			arrLength--;
		}

		FileWriter fileWriter = new FileWriter(new File("output.txt"));

		for(int i = 0; i < arrLikeCounter.length; i++) fileWriter.write(String.valueOf(arrLikeCounter[i]) + " ");
		fileWriter.write("\n");
		fileWriter.close();
	}
}