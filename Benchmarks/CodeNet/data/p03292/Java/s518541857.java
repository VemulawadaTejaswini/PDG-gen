import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = a;
		int b = sc.nextInt();
		int y = b;
		if(b > a) {
			x = b;
			y = a;
		}
		int c = sc.nextInt();
		int z = c;
		if(c > x) {
			z = y;
			y = x;
			x = c;
		}else if(c > y) {
			z = y;
			y = c;
		}

		System.out.println((x-y)+(y-z));


	}
}