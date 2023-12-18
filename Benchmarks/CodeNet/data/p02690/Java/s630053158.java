import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(long i = -1000; i <= 1000; i++) {
			for(long j = -1000; j <= 1000; j++) {
				if(Math.pow(i, 5) - Math.pow(j, 5) == X) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}

}
