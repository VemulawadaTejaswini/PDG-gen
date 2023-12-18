import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i = 0; i < n; i++){

			a[i] = sc.nextInt();

		}

		ArrayDeque<Long> que = new ArrayDeque<Long>();
		for (int i = 0; i < n; i++){
			if (i % 2 == 0){
				que.addFirst(a[i]);
			} else {
				que.addLast(a[i]);
			}
		}

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for (Iterator<Long> it = que.iterator(); it.hasNext();){
			sb1.append(it.next());
			sb1.append(" ");
		}
		sb2.append(sb1.substring(0, sb1.length()-1));
		if (n % 2 == 0){
			System.out.println(sb2.reverse().toString());
		} else {
			System.out.println(sb2.toString());
		}

	}

}
