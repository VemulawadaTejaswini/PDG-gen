import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] list = sc.nextLine().split(" ",0);
		int gcd;
		int a1;
		int tmp;
		int x,y;
		List<Integer> gcdList = new ArrayList<>();
		for (int i=0;i<N;i++) {
			if (i == 0) {
				gcd = Integer.parseInt(list[1]);
			} else {
				gcd = Integer.parseInt(list[0]);
			}
			for (int j=0; j<N; j++) {
				if (j == i) {
					//
				} else {
					a1 = Integer.parseInt(list[j]);
					if (gcd < a1) {
						x = a1;
						y = gcd;
					} else {
						x = gcd;
						y = a1;
					}
					while ((tmp = x % y) != 0) {
						x = y;
						y =tmp;
					}
					gcd = y;
				}
			}
			gcdList.add(gcd);

		}
		int max = Collections.max(gcdList);
		System.out.println(max);
		sc.close();
	}

}