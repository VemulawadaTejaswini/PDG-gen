import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute5_3();
	}
	
	private static void execute5_3() {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int A = sc.nextInt();
			
			int ans = (H+A-1)/A;
			
			
			System.out.println(ans);
		}
	}
}