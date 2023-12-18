import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		if(a == b && b == c){
			if(a % 2 == 1){
				System.out.println("-1");
			}else{
				System.out.println("0");
			}
		}else{
			int i = 0;
			while(a %2 == 0 && b % 2 == 0 && c % 2 == 0){
				int ta, tb, tc;
				ta = (b + c) / 2;
				tb = (a + c) / 2;
				tc = (a + b) / 2;
				a = ta;
				b = tb;
				c = tc;
				i++;
			}
			System.out.println(i);
		}
	}
}