import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
        function();
	}

	public static void function() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n >= m) {
        	System.out.println(0);
        	System.exit(0);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	int tmp = sc.nextInt();
        	list.add(tmp);
        }
		Collections.sort(list);

		List<Integer> dist = new ArrayList<>();
		for(int i = 1; i < list.size(); i++) {
			dist.add( list.get(i) - list.get(i-1) );
		}

		solve(n, dist);
	}

	static void solve(int n, List<Integer> dist) {
		Collections.sort(dist);

		for(int i = 1; i < n; i++) {
			dist.remove( dist.size()-1 );
		}
		System.out.println(sum(dist));
	}

	static int sum(List<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
