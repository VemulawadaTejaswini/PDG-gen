import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();
		int k = src.nextInt();
		int sum = 0;
		for(int i = 0; i < k; i++) {
			if(a != 0) {
				sum += 1;
				a--;
			}else if(b != 0) {
				b--;
			}else if(c != 0) {
				sum -= 1;
				c--;
			}
		}
		System.out.println(sum);
	}
}