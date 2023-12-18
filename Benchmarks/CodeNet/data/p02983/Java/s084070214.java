
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long R = sc.nextLong();
		long L = sc.nextLong();
		
		long min = Long.MAX_VALUE;
		
		for(long i = R; i < L-1; i++) {
			for(long j = L; j > i; j--) {
				System.out.println(Math.floorMod(i * j , 2019));
				if(min > Math.floorMod(i * j , 2019)) {
					min = Math.floorMod(i * j , 2019);
				}
			}
		}
		System.out.println("min " + min);
		sc.close();
	}

}
