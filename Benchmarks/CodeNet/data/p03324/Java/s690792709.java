import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		if(n == 0) {
			System.out.println(m);
		}else if(n == 1){
			System.out.println(100*m);
		}else {
			System.out.println(10000*m);

		}

	}

}
