import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ABCD = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int ttW_Tak = (ABCD[2] - 1) / ABCD[1]; 
		int ttW_Aok = (ABCD[0] - 1) / ABCD[3];
		System.out.println(ttW_Tak <= ttW_Aok ? "Yes" : "No");
	}
}
