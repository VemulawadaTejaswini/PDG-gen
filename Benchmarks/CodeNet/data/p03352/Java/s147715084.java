import java.util.Scanner;
import java.util.TreeSet;
 
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		TreeSet<Integer> expo = new TreeSet<>();
		expo.add(1);
		for(int i = 1; i <= x; i++) {
			for(int n = 2; n < x; n++) {
				double result = Math.pow((double)i,(double)n);
				if(result > x) {
					break;
				}else {
					expo.add((int)result);
				}
			}
		}
		
		System.out.println(expo.last());
	}
}