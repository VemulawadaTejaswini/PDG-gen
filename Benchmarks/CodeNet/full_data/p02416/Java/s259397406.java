import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		int i = 0;
		while (true) {
			int abc = sc.nextInt();
			if (abc == 0) {
				break;
			} else {
				String data = String.valueOf(abc);
				String[] result = new String[data.length()];
				
					for (i = 0; i <= data.length() - 1; i++) {
						result[i] = String.valueOf(data.charAt(i));
						a = Integer.parseInt(result[i]);
						sum = sum + a;
					}

					System.out.println(sum);
					sum = 0;
				}
			
		}
	}

}

