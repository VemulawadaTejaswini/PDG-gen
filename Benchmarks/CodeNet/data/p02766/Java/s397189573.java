import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n=scan.nextLong();
		int k=scan.nextInt();
		scan.close();
		int cnt=1;
		while(true) {
			if(Math.pow(k,cnt) > n) {
				break;
			}else cnt++;
		}

		System.out.println(cnt);
	}
}