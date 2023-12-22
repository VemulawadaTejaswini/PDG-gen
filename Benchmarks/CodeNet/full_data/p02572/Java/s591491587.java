import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");
		Long result = 0L;
		// 左側の数字を決める
		for (int i=0; i<count-1; i++) {
			// 右側の数字を決める
			for (int j=i+1; j<count; j++) {
				result += Long.parseInt(input[i])*Long.parseInt(input[j]);
			}
		}
		System.out.println(result);
	}
}
