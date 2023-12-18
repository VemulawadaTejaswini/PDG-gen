import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i=0; i<n; i++){
			b.add(a[i]);
			Collections.reverse(b);
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<b.size(); i++){
			if (i > 0){
				sb.append(" ");
			}
			sb.append(b.get(i));
		}
		System.out.println(sb.toString());
	}

}
