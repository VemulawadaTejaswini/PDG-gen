import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args){
		int i, j, q, order, x, L, R, next;
		Set<Integer> set = new TreeSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				x = sc.nextInt();
				switch(order) {
				case 0 :
					set.add(x);
					System.out.println(set.size());
					break;
				case 1 :
					System.out.println(set.contains(x) ?  "1" : "0");
					break;
				case 2 :
					set.remove(x);
					break;
				case 3 :
					Object[] set_array = set.toArray();
					R = sc.nextInt();
					L = Arrays.binarySearch(set_array, x);
					R = Arrays.binarySearch(set_array, R);
					if(L < 0) {
						L = -L - 1;
					}
					if(R < 0) {
						R = -R - 1;
					}
					if(R > set_array.length - 1) {
						R = set_array.length - 1;
					}
					for(j = L; j <= R; j++) {
						System.out.println(set_array[j]);
					}
					break;
				}
			}
		}
	}
}


