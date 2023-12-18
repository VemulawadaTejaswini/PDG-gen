import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		
		long max = 0;
		long num = 0;
		
		for(int i = 0; i < Y; i++) {
			max = (long)Math.pow(2, i) * X;
			if(max <= Y) {
				num = i + 1;
			} else {
				break;
			}
		}
		System.out.println(num);
	}
}
