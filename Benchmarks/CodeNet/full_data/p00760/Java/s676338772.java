import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mil = days(1000,1,1);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			System.out.println(mil-days(y,m,d));
		}
	}
	
	public static int days(int y,int m,int d) {
		y--; m--; d--;
		int days = 0;
		days += (y/3) * ((20+19)*5*2 + 20*10);
		days += (y%3) * ((20+19)*5);
		if (y%3 <= 1) {
			days += (m/2) * (20+19);
			days += (m%2) * 20;
		}else{
			days += m * 20;
		}
		days += d;
		return days;
	}

}