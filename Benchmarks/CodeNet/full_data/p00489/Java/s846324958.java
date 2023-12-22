import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] pointArray = new int [100];
		int [] rankArray = new int [100];
		int numberOfTeams, maxNumber;
		int a, b, aPoint, bPoint;
		
		numberOfTeams = sc.nextInt();
		maxNumber = numberOfTeams * (numberOfTeams - 1) / 2;
		
		for (int i = 0; i < maxNumber; i++) {
			pointArray[i] = 0;
			rankArray[i] = 1;
		}
		
		for (int i = 0; i < maxNumber; i++) {
			a = sc.nextInt()-1;
			b = sc.nextInt()-1;
			aPoint = sc.nextInt();
			bPoint = sc.nextInt();
			
			if (aPoint > bPoint) {
				pointArray[a] += 3;
			}else if (aPoint < bPoint) {
				pointArray[b] += 3;
			}else {
				pointArray[a]++;
				pointArray[b]++;
			}
		}
		
		for (int i = 0; i < maxNumber; i++) {
			for (int j = 0; j < maxNumber; j++) {
				if (pointArray[i] < pointArray[j]) {
					rankArray[i]++;
				}
			}
		}
		
		for (int i = 0; i < numberOfTeams; i++) {
			System.out.printf("%d\n", rankArray[i]);
		}

	}

}