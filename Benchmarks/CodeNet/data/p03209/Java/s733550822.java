import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer> a = new ArrayList<Integer>();
	static ArrayList<Integer> p = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long x = Long.parseLong(sc.next());
		a.add(1);
		p.add(1);
		for(int i=1; i<n; i++){
			a.add(2*a.get(i-1) + 3);
			p.add(2*p.get(i-1) + 2);
		}
		System.out.println(f(n, x));
	}

	public static long f(int num, long eat) {
		if (eat == 1){
			return 0;
		}else if (eat > 1 && eat < a.get(num-1) + 2){
			return f(num-1, eat);
		}else if (eat == a.get(num-1) + 2){
			return p.get(num-1);
		}else if (eat > a.get(num-1) + 2 && eat > 2*a.get(num-1) + 1){
			return p.get(num-1) + 1 + f(num-1, eat - p.get(num-1) - 1);
		}else {
			return 2 * p.get(num-1) + 1;
		}
	}
}