
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long h  = sc.nextLong();
		long temp = h;
		long num = 1;
		long count = 1;
		while(temp/2 != 0) {
			temp = temp/2;
			count=(int) (Math.pow(2, num)-1);
			num++;
		}
		System.out.println(count+h);
	}

}