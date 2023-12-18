import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();//not use
		String input = sc.nextLine();
		int listI[] = splitStringToArrayOfInt(input);
		int count = 1;
		for(int i = 1 ; i < listI.length ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(listI[j] <= listI[i] && j == (i-1)) {
					count++;
				}else if(listI[i] < listI[j]) {
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	private static int[] splitStringToArrayOfInt(String input) {
		return Arrays.stream(input.split(" ")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
	}
}
