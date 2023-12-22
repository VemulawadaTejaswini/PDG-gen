import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataSetOfNum = scan.nextInt();
		int[] dataSet = new int[3];
		int side1, side2, side3;
		
		for(int i = 0; i < dataSetOfNum; i++) {
			dataSet[0] = scan.nextInt();
			dataSet[1] = scan.nextInt();
			dataSet[2] = scan.nextInt();
			Arrays.sort(dataSet);
			
			if((Math.pow(dataSet[0], 2) + Math.pow(dataSet[1], 2)) == Math.pow(dataSet[2], 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}
}