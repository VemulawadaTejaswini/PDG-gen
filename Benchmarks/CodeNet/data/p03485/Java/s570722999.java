import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = (a+b);
		if(c%2==1) {
			System.out.println(c/2+1);
		}else {
			System.out.println(c/2);
		}
	}

}