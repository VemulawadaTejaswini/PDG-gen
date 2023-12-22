import java.util.Scanner;
public class AOJ0134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nexｔint();
		long a = 0;
		for(int i=0;i<n;i++)a+=sc.nextint();
		System.out.println(a/n);
	}
}