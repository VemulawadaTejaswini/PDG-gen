import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static final String IS_GO = "1";
	public static final String IS_NO_GO = "0";


	public static void main(String[] args) throws IOException {

		BufferedReader buffReader = new BufferedReader(new FileReader("input.txt"));
		ArrayList<Integer[]> alArrGoPosition = new ArrayList<Integer[]>();

		while(true) {
			String[] arrMenberPosition = buffReader.readLine().split(" ");
			int member = Integer.parseInt(arrMenberPosition[0]);
			int position = Integer.parseInt(arrMenberPosition[1]);

			if(member == position && member == 0) break;

			String[][] arrIsPositionGoStr = new String[member][position];
			for(int i = 0; i < member; i++) arrIsPositionGoStr[i] = getStringCharArr(buffReader.readLine());
			Integer[] arrGoPosition = new Integer[position];

			for(int i = 0; i < member; i++) {
				for(int j = 0; j < position; j++) {
					if(arrIsPositionGoStr[i][j].equals(IS_GO)) arrGoPosition[j]++;
				}
			}

			//Sort
			for(int i = 0; i < position; i++) {
				for(int j = 0; j < position; j++) {
					if(arrGoPosition[j] < arrGoPosition[i]) {
						int tmp = arrGoPosition[i];
						arrGoPosition[i] = arrGoPosition[j];
						arrGoPosition[j] = tmp;
					}
				}
			}

			alArrGoPosition.add(arrGoPosition);
		}

		FileWriter fileWriter = new FileWriter("output.txt");
		for(Integer[] arrGoPosition: alArrGoPosition) {
			for(int pos: arrGoPosition) fileWriter.write(String.valueOf(pos) + " ");
			fileWriter.write("\n");
		}
		fileWriter.close();
	}

	public static String getStringCharAt(String str, int position) {
		return String.valueOf(str.charAt(position));
	}

	public static String[] getStringCharArr(String str) {

		String[] arrResult = new String[str.length()];

		for(int i = 0; i < str.length(); i++) arrResult[i] = getStringCharAt(str, i);

		return arrResult;
	}
}