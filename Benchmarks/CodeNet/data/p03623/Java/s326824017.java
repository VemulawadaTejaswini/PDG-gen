import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int buff1 =x-a;
		int buff2 = x-b;

		if(buff1<0) {
			buff1=buff1*-1;
		}
		if(buff2<0) {
			buff2=buff2*-1;
		}
		if(buff1>=buff2) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}


	}

	public static long res(long n) {
		if(n<2) {
			return 1;
		}

		return n*res(n-2);
	}
}


