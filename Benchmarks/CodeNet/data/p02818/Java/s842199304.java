import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long buff=0,c=0,d=0;

		buff = a-k;
		d = a-k;
		if(buff<0) {
			d=0;
			buff = buff*-1;
		}
		c = b-buff;
		if(c<0) {
			c=0;
		}
		System.out.println(d+" "+c);

	}

	public static long f5(long n) {
		if(n%5!=0) {
			return 0;
		}else{
			return 1+f5(n/5);
		}
	}
}


