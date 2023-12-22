import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long money = 100;

		for(int i = 0; i <= 3761; i++) {
			double temp = money*Math.pow(1+0.01, i);
			if(temp >= x) {
				System.out.println(i);
				break;
			}
		}
	}

}
