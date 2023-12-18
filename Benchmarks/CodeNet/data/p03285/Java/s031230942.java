import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 16; j++) {
				if ((i * 4) + (j * 7) == N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		
		System.out.println("No");
	}
}