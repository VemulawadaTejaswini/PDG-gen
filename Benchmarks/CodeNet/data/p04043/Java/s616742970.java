import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "NO";
		
		int[] input = new int[3];
		for (int i=0; i<3; i++) {
			input[i] = sc.nextInt();
		}
		
		int count5 = 0;
		int count7 = 0;
		
		for (int j=0; j<3; j++) {
			if (input[j] == 5) {
				count5++;
			} else if (input[j] == 7) {
				count7++;
			} else {
				break;
			}
		}
		
		if (count5 == 2 && count7 == 1) {
			result = "YES";
		}
		
		System.out.println(result);
	}

}
