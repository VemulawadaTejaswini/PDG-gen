import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		ArrayList<Integer> x = new ArrayList<>(al);
		Collections.sort(x);
		int tmp1 = x.get(n/2 - 1);
		int tmp2 = x.get(n/2);
		for(int i : al) {
			if(i >= tmp2) {
				System.out.println(tmp1);
			}else {
				System.out.println(tmp2);
			}
		}
	}
}