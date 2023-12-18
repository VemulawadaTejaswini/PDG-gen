import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		System.out.println("z="+z);
//
		
		int a = x-z;
//		System.out.println("a="+a);
		
		int sum = a / (y+z);
		System.out.println(sum);
	}

}
