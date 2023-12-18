import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] strArray = new String[N];
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = sc.next();
		}
		Arrays.sort(strArray);
		System.out.println(Arrays.stream(strArray).collect(Collectors.joining()));
		sc.close();
	}
}