import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if (i % 3 == 0 || i % 10 == 3) {
				if (i == 3){
					System.out.print( i );
				}else{
					System.out.print(" "+ i );
				}
			}


		}
	}
}