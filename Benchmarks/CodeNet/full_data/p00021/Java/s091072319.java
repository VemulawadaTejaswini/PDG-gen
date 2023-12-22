import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int counter = Integer.parseInt(bufferedReader.readLine());	//input number

		ArrayList<Double[]> alPos = new ArrayList<Double[]>();	//set position
		ArrayList<Boolean> alIsParallel = new ArrayList<Boolean>();

		for(int i = 0; i < counter; i++) {
			String[] arrPosRow = bufferedReader.readLine().split(" ");
			Double[] arrPos = new Double[8];

			for(int j = 0; j < arrPos.length; j++) arrPos[j] = Double.parseDouble(arrPosRow[j]);
			alPos.add(arrPos);
		}

		for(int i = 0; i < counter; i++) {
			Double[] arrPos = alPos.get(i) ;

			double a1 = (arrPos[0] - arrPos[2]) / (arrPos[1] - arrPos[3]);
			double a2 = (arrPos[4] - arrPos[6]) / (arrPos[5] - arrPos[7]);

			alIsParallel.add(a1 == a2);
		}

		for(int i = 0; i < alIsParallel.size(); i++)
			if(alIsParallel.get(i)) System.out.println("YES");
			else System.out.println("NO");
	}
}