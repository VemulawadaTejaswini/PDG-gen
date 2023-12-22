import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner x  = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();// image a > b;
		int r;

		while(true) {
		r = a % b;
		if(r==0)break;
		a = b;	
		b = r;

		}
		System.out.println(b);


}
}
