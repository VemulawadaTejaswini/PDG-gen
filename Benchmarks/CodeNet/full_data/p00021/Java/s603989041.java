import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int amountOfDataset = Integer.parseInt(str);

			for(int i = 1; i <= amountOfDataset; i++){
				str = br.readLine();
				String[] dataSet = str.split(" ", 0);

				double x1 = Double.parseDouble(dataSet[0]);
				double y1 = Double.parseDouble(dataSet[1]);
				double x2 = Double.parseDouble(dataSet[2]);
				double y2 = Double.parseDouble(dataSet[3]);
				double x3 = Double.parseDouble(dataSet[4]);
				double y3 = Double.parseDouble(dataSet[5]);
				double x4 = Double.parseDouble(dataSet[6]);
				double y4 = Double.parseDouble(dataSet[7]);

				double lineAB = (y1 - y2)/(x1 -x2);
				double lineCD = (y3 - y4)/(x3 -x4);

				if(lineAB == lineCD){
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}