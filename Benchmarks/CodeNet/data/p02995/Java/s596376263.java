import java.util.Scanner;

public class A_Security {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num_min=scan.nextLong();
		long num_max=scan.nextLong();
		long num_a=scan.nextLong();
		long num_b=scan.nextLong();

		int cnt = 0;

		for(long i = num_min ;i <= num_max ; i++ ) {
			if(i%num_a !=0 && i%num_b !=0 ) {
				cnt++;
			}
		}
		System.out.println(cnt);
		return;
	}
}