import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++)  {
			num[i] = stdin.nextInt();
		}

		for(int k = 1; k <= num.length; k++) {

			for(int j = 0; j < num.length - k; j++) {
				if(num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}
		}

		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}


}