import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intLoop = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int intAve = 0;
		int intTemp = 0;
		double dbVariance = 0;
		double dbDeviation = 0;
		ArrayList<Double> devList = new ArrayList<Double>();
		while (intLoop != 0) {
			dbVariance = 0;
			intAve = 0;
			list = new ArrayList<Integer>();
			for (int i = 0; i < intLoop; i++) {
				intTemp = scan.nextInt();
				list.add(intTemp);
				intAve += intTemp;
			}
			intAve = intAve / intLoop;
			for (int i = 0; i < intLoop; i++) {
				dbVariance += Math.pow(list.get(i) - intAve, 2);
			}
			dbVariance /= 5;
			dbDeviation = Math.sqrt(dbVariance);
			devList.add(dbDeviation);
			intLoop = scan.nextInt();
		}
		for(int i = 0; i < devList.size(); i++){
			System.out.println(devList.get(i));
		}
	}
}