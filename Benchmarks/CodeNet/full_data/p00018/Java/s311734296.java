import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			list.add(a);
			list.add(b);
			list.add(c);
			list.add(d);
			list.add(e);
			Collections.sort(list);
			for(int x = 4; x >= 0  ; x--){
				System.out.print(list.get(x));
				if (x != 0) System.out.print(" ");
			}
			System.out.println();
		sc.close();
	}

}