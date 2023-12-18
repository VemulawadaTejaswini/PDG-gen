import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int price = 0;
		int max = 0;
		for(int i = 0;i < N;i++) {
			int in = s.nextInt();
			price += in;
			max = Math.max(max, in);
		}
		System.out.println(price - max/2);
		
	}

}
