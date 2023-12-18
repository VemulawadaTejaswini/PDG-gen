import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		LocalDateTime l1 = LocalDateTime.of(2017,12,30,m,0);
		LocalDateTime l2 = LocalDateTime.of(2018,1,1,0,0);
		Duration d1 = Duration.between(l1, l2);
		System.out.println(d1.toHours());
	

	}

}
