import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		int  dep = 100;
		double rate = 1.01;

		for(int i = 1; i <= 4000; i++) {
			long temp = (long) (100* Math.pow((rate),i ));
			if(temp >= x) {
				if(x >= 100000000) {
					i+=57;
				}
				System.out.println(i);
				break;
			}
		}



	}

}