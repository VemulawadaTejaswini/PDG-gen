import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();

		int A = 0;
		int B = 0;
		for(int i=-100; i<=100; i++) {
			for(int j=-100; j<=100; j++) {
				long ans = (long)Math.pow(i, 5) - (long)Math.pow(j, 5);
				if(ans == X) {
					A = i;
					B = j;
					break;
				}
			}
		}

		System.out.println(A + " " + B);

	}


}
