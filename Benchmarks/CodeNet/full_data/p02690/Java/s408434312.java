import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		for (long i = -100; i<= 100; i++){
			for (long j = -100; j<=100; j++){
				long ans = (long) (Math.pow(i, 5) - Math.pow(j, 5));
				if (x == ans){
					System.out.println(i + " " + j);
					return;
				}
			}
		}

	}


}