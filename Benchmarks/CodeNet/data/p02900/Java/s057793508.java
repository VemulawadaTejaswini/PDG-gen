import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
long c=Math.min(a,b);
		ArrayList<Integer> sosu = new ArrayList<Integer>();
		sosu.add(1);

		for (int i = 2; i <= Math.sqrt(c)+2;) {
			if (a % i == 0 && b % i == 0) {

					sosu.add(i);
while(a%i==0&&b%i==0){
				a /= i;
				b /= i;}
			} else
				i++;
		}
		System.out.println(sosu.size());

	}

}
