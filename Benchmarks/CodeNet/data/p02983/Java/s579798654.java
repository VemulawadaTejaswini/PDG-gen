import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int div = 2019;
		long L = Integer.parseInt(sc.next());
		long R = Integer.parseInt(sc.next());
		long l = L/div;
		long r =R /div;
		if(l != r) {
			System.out.println(0);
		}else {
			long diff = ((L % div) * ((L+1) % div)) % div;
			System.out.println(diff);
		}
		sc.close();
	}
}
