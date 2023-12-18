
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long n=sc.nextLong();
		long a=sc.nextLong();
	    long b=sc.nextLong();
		long c=0;

		c=n/(a+b)*a;
		c+=n%(a+b);
		System.out.println(c);



	}

}