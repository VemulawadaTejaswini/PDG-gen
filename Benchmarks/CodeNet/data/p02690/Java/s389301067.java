import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		long x = sc.nextLong();
		for(long a = 0; a <= x;a++) {
			for(long b =  -x; b <= 0;b++) {
				long temp = (int) (Math.pow(a+b, 5/2)*Math.pow(a-b, 5/2));
				if(temp == x) {
					System.out.println(a + " " + b);
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}




	}

}