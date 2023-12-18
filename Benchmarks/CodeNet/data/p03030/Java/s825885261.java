
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		String[] info = new String[number];
		for (int i = 0; i < number; i++) {
			// 都市名、スコア、番号
			info[i] = scan.next() + "," + (Integer.MAX_VALUE - scan.nextInt()) + scan.nextInt();
		}
		
		Arrays.sort(info);
		for (String str : info) {
			String ans = str.split(",")[2];
			System.out.println(ans);
		}
	}
}