
import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		long year=0;
		long yoki=100;
		while(yoki<X) {
			year++;
			yoki*=1.01;
		}
		System.out.println(year);
		}
}
