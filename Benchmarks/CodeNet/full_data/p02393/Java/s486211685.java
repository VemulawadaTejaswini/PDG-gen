import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nStr0 = sc.next();
		String nStr1 = sc.next();
		String nStr2 = sc.next();
		int n0 = Integer.parseInt(nStr0);
		int n1 = Integer.parseInt(nStr1);
		int n2 = Integer.parseInt(nStr2);

		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		if(n0 > n1) {
			int tmp = n0;
			n0 = n1;
			n1 = tmp;
		}
		System.out.println(n0 + " " + n1 + " " + n2);
		sc.close();
	}
}