import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//
		int a = sc.nextInt();
		int b = sc.nextInt();

		int [] haco = {(a)+(b), (a)-(b), (a)*(b)};

		int max = 0;

		if(a < -1000 | b > 1000) {
		}
		else {
	        for(int i = 0; i < haco.length; i++)
	            max = Math.max(max,haco[i]);
	        System.out.println(max);
		}
	}
}