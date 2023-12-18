import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			int numA = Integer.parseInt(line);
			int[] tmpList = new int[numA];

			line = sc.nextLine();
			String[] tmpArray = line.split(" ");

			int minIndex=0;
			int tmpMin = 0;
			for (int i = 0; i < tmpArray.length; i++) {
				tmpList[i] = Integer.parseInt(tmpArray[i]);
				if (tmpMin == 0) {
					tmpMin = tmpList[i];
					minIndex = i;
				} else if (tmpMin > tmpList[i]) {
					tmpMin = tmpList[i];
					minIndex = i;
				}
			}
			int deadCnt = 0;
			while (true) {
				for (int i = 0; i < numA; i++) {

					if (i == minIndex || tmpList[i] == 0) {
						continue;
					}
					if(tmpList[i] % tmpMin == 0){
						tmpList[i] = 0;
						deadCnt++;
						continue;
					}
					if (tmpList[i] > tmpMin) {
						tmpList[i] -= tmpMin;
					} else {
						tmpList[i] = 0;
						deadCnt++;
						continue;
					}
					
					
					if (tmpList[i] > 0 && tmpList[i] < tmpMin) {
						tmpMin = tmpList[i];
						minIndex = i;
					}
				}
				if (deadCnt == numA-1) {
					break;
				}
			}
			System.out.println(tmpMin);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}