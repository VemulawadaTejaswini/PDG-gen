import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int listI[] = splitStringToArrayOfInt(input);
		String result ="No";
		if(listI[0] > listI[2]) {
			if(listI[2] > listI[1] ) {
				result = "Yes";
			}
		}else {
			if(listI[1] > listI[2] ) {
				result = "Yes";
			}
		}
		System.out.println(result);
	}

	private static int[] splitStringToArrayOfInt(String input) {
		return Arrays.stream(input.split(" ")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
	}
}