import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b  = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int min1 = a;
		int min2 = c;
		if(a > b) min1 = b;
		if(c > d) min2 = d;
		int ans;
		ans = min1 + min2;
		System.out.println(ans);
	}
}

