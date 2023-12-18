import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.nextLine();
		int[] array = new int[count];
		int[] array2 = new int[count];
		int number = 0;
		int number2 = 0;
		boolean flag = false;
		for (int i = 0; i < count; i++) {
			array[i] = Integer.valueOf(sc.nextLine());
			array2[i] = array[i];
			if (array[i] == 1) {
				number = i;
				flag = true;
			}
			if (array[i] == 2) {
				number2 = i;
			}
		}
		sc.close();
		boolean stopFlag = false;
		int result = 0;
		boolean flag2 = false;
		while(!stopFlag) {
			
			if (!flag && !flag2) {
				Arrays.sort(array2);
				if (array2[0] == 2) {
					result++;
					number = array2[1] - 1;
				} else {
					result = -1;
					break;
				}
				flag2 = true;
			}
			if (array[number] == 2) {
				break;
			} else {
				result++;
				number = array[number] - 1;
			}
			if (result > count) {
				result = -1;
				break;
			}
		}
		
		if (!flag) {
			result = result + 1;
		}
		
		System.out.println(result);
	}
}