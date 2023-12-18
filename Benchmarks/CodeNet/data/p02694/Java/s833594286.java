import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		int cnt = 0;
		int mon = 100;
		while(true) {
			if(x <= mon) {
				System.out.println(cnt);
				break;
			}
			mon= mon * 101/100;
			cnt++;
		}
	}
	
}