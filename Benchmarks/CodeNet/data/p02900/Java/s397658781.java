import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			float x = scan.nextInt();
			float y = scan.nextInt();

			int c = 1;
			int s = 2;
			
			Set<Integer> xSet = new HashSet<>();
			Set<Integer> ySet = new HashSet<>();
			
			float xNum = x;
			while (s <= xNum) {
				if(xNum % s == 0) {
					xNum /= s;
					xSet.add(s);
				} else {
					s++;
				}
			}
			
			s = 2;
			float yNum = y;
			while (s <= yNum) {
				if(yNum % s == 0) {
					yNum /= s;
					ySet.add(s);
				} else {
					s++;
				}
			}
			
			
			for(Integer i: xSet) {
				if(ySet.contains(i)) {
					c++;
				}
			}
			System.out.println(c);

		}
	}
}