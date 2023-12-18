import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numDays = sc.nextInt();
		int[] activityCost = new int[3];
		for(int day = 0; day < numDays; day++) {
			int[] newActivityCost = new int[3];
			int[] activityHappiness = new int[3];
			for(int i = 0; i < 3; i++) {
				activityHappiness[i] = sc.nextInt();
			}
			
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j != k) {
						newActivityCost[k] = Math.max(newActivityCost[k], activityCost[j] + activityHappiness[k]);
					}
				}
			}
			System.arraycopy(newActivityCost, 0, activityCost, 0, 3);
		}
		System.out.println(Math.max(activityCost[0], Math.max(activityCost[1], activityCost[2])));
	}
}