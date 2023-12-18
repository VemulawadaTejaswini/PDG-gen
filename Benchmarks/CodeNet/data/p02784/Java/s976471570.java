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
			long H = sc.nextLong();
			int N = sc.nextInt();
			
			
			for(int i=0; i<N;i++) {
				long a = sc.nextLong();
				H = H-a;
			}
			if(0<H) {
				
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}