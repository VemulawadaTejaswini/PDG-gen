import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static int[] x;
	static int[] y;
	static Set<Integer>[] num;
	static int n;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			n = sc.nextInt();
			x = new int[n];
			y = new int[n];
			num = new TreeSet[n];
			
			for(int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				num[i] = new TreeSet<Integer>();
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(search(i).size());
			}
		}
		
		sc.close();
	}
	
	public static Set search(int id) {
		if(!num[id].isEmpty()) {
			return num[id];
		}
		
		num[id].add(id);
		
		for(int i = 0; i < n; i++) {
			if((x[id] < x[i] && y[id] < y[i]) || (x[id] > x[i] && y[id] > y[i])) {
				num[id].addAll(search(i));
			}
		}
		
		return num[id];
	}
}
