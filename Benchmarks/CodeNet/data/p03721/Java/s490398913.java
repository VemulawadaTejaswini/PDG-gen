import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		long k = sc.nextLong();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int tmpnum = 0;
		int tmpcount = 0;
		for(int i = 0; i < n; i++) {
			tmpnum = sc.nextInt();
			tmpcount = sc.nextInt();
			for(int j = 0; j < tmpcount; j++) {
				al.add(tmpnum);
			}
		}
		Collections.sort(al);

		System.out.println(al.get((int) (k-1)));
	}
}