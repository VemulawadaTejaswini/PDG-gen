import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			Double x = scan.nextDouble();
			Double y = scan.nextDouble();

			int c = 1;
			Double s = 2.0;
			
			Set<Double> xSet = new HashSet<>();
			Set<Double> ySet = new HashSet<>();
			Double xNum = x;
			while (s <= xNum) {
				if(xNum % s == 0) {
					xNum /= s;
					xSet.add(s);
				} else {
					s++;
				}
			}
			s = 2.0;
			Double yNum = y;
			while (s <= yNum) {
				if(yNum % s == 0) {
					yNum /= s;
					ySet.add(s);
				} else {
					s++;
				}
			}
			
			
			for(Double i: xSet) {
				if(ySet.contains(i)) {
					c++;
				}
			}
			System.out.println(c);

		}
	}
}