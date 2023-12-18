import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.nextLine();
		int[] array = new int[count];
		int number = 0;
		for (int i = 0; i < count; i++) {
			array[i] = Integer.valueOf(sc.nextLine());
			if (array[i] == 1) {
				number = i;
			}
		}
		sc.close();
		
		boolean stopFlag = false;
		int result = 0;
		
		while(!stopFlag) {
			if (array[number] != 2) {
				result++;
				number = array[number] - 1;
			} else {
				break;
			}
			if (array[number] == 1) {
				result = -1;
				break;
			}
		}

		System.out.println(result);
	}
}