import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 3;
		while(i <= n) {
			if(i % 3 == 0 || String.valueOf(i).contains("3")) {
				Integer.valueOf(i);
				System.out.printf(" %d", i);
			}
			i++;
		}
		
	}
}