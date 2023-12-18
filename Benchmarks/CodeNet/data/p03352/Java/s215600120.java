import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = Integer.parseInt(sc.next());
		for (int i=0; i<33; i++){
			if (Math.pow(i, 2) > X){
				System.out.println((int)Math.pow(i-1, 2));
				return;
			}
		}
	}
}