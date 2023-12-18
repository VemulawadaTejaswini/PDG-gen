import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int X = sc.nextInt();
		int Y = 0;;
		for(int i = 1; i <= 1000; i++) {
			if(X - 100 * i >= 0) {
				Y = i;
			}
		}
		if(X - 100 * Y <= 5 * Y) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
