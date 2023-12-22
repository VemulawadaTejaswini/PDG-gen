//package solve;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; sc.hasNext(); ) {
			list.add(i, sc.nextInt());
			if ( list.get(i) == 0 ) {
				System.out.println(list.get(i-1));
				i--;
			}
			else i++;
		}
	}
}