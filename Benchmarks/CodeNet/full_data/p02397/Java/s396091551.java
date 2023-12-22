import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int[][] num = new int[3000][2];
		int temp;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3000; i++) {
			num[i][0] = scanner.nextInt();
			num[i][1] = scanner.nextInt();

			if(num[i][0] >= 0 && num[i][0]<=10000 && num[i][1] >= 0 && num[i][1]<=10000) {
				if(num[i][0] > num[i][1]) {
					temp = num[i][0];
					num[i][0] = num[i][1];
					num[i][1] = temp;
				}
			}
			if(num[i][0] == 0 && num[i][1] == 0) {
				count = i;
				break;
			}
		}
		for(int j = 0; j < count; j++) {
			System.out.println(num[j][0] + " " + num[j][1]);
		}
	}

}