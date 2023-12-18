import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long c = sc.nextLong();

		if(s * 2 > c ) {
			System.out.print(s);
		}else{
			System.out.print(s + (c -s)/ 4);
		}


		sc.close();
	}

}
