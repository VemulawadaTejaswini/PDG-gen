import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int y = 1;  //2数の差(a-b?)

		loop: for(int i = 0; i < 119; i++) {
			//System.out.println(y + i);
			if(x % Math.abs(y + i) == 0) {
				for(int j = -119; j <= 118; j++) {
					int a = j;
					int b = j - (y + i);
					//System.out.println(a+" " +b);
					if((long)x == ((long)(y + i) * (a*a*a*a + a*a*a*b + a*a*b*b + a*b*b*b +b*b*b*b))) {
						System.out.println("found" + a + " " + b);
						break loop;
					}
				}
			}
		}

		sc.close();

	}

}
