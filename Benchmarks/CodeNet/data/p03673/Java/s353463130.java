import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList b = new ArrayList();

		for (int i = 0; i < n; i++){
			b.add(scan.nextInt());
			Collections.reverse(b);
		}

		System.out.print(b.get(0));
		for (int i = 1; i < n; i++){
			System.out.print(" " + b.get(i));
		}
	}
}