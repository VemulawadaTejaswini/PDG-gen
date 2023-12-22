import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String			getData;
		BufferedReader 	reader = new BufferedReader(new InputStreamReader(System.in));


		while((getData = reader.readLine()) != null){
			String[]	dataList =getData.split(" ");
			double[]		valueList= new double[dataList.length];

			for(int i = 0; i < dataList.length; i++){
				valueList[i] = Double.parseDouble(dataList[i]);
			}

			System.out.printf("%.3f %.3f\n", (valueList[2] * valueList[4] - valueList[1] * valueList[5]) / (valueList[0] * valueList[4] - valueList[1] * valueList[3]),
					 (valueList[5] * valueList[0] - valueList[2] * valueList[3]) / (valueList[0] * valueList[4] - valueList[3] * valueList[1]));

		}

	}
}