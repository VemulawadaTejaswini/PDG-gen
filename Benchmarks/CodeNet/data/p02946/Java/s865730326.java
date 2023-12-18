import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		 int K = scan.nextInt();
		 int X = scan.nextInt();

		 scan.close();

		 for(int i=-(K-1);i<K;i++) {
			 System.out.print(X+i + " ");
		 }
	}
}
