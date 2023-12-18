import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),
			b = sc.nextInt(),
			c = sc.nextInt(),
			x = sc.nextInt(),
			cout = 0;
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int k = 0; k <= c; k++) {
					if(x == i * 500 + j * 100 + k * 50) cout++;
				}
			}
		}
		System.out.println(cout);
	}
}