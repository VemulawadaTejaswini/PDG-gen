import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d,n;
		d = sc.nextInt();
		n = sc.nextInt();

		int ans = 100;
		if(d == 0)
			System.out.println(n);
		if(d == 1)
				System.out.println(n*100);
		if(d == 2)
			System.out.println(n *10000);
		}
	
	}
