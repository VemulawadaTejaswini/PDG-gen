import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		long x=scan.nextLong();
		long m=100;
		long y=1;
		for(;;) {
			m=m*101/100;
			if(m>=x) {
				System.out.println(y);
				break;
			}
			else {
				y++;
			}
		}
	}
}