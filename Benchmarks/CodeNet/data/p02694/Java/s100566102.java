import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		int  dep = 100;
		int ans = 0;

		for(int i = 1; i <= 4000; i++) {
			long temp = (long) (100* Math.pow((1.01),i ));
			if(temp >= x) {
				if(x>999) {
					System.out.println(i+57);
					return;
				}
				System.out.println(i);
				break;
			}
		}



	}

}
