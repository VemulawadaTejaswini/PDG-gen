import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int spotCount = sc.nextInt();
		int firstSpot = sc.nextInt();
		int[] dangerousZone = new int[spotCount];
		int leftSpot = 0;
		int rightSpot = 0;
		for (int i = 0; i < spotCount; i++) {
			dangerousZone[i] = sc.nextInt();
			if (0 < dangerousZone[i] && dangerousZone[i] < firstSpot) {
				leftSpot++;
			} else {
				rightSpot++;
			}
		}
		if (leftSpot > rightSpot) {
			System.out.println(rightSpot);
		} else {
			System.out.println(leftSpot);
		}
		
	}

}