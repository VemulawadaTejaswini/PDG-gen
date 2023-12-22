import java.io.BufferedReader;
import java.io.FileReader;
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

	}
}