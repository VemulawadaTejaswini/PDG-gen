import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c[] = new char[n];
		String s = sc.next();
		List<Integer> w = new ArrayList<Integer>();
		List<Integer> r = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
			if (c[i] == 'W') {
				w.add(i);
			} else {
				r.add(i);
			}
		}
		int count = 0;
		while(!check(r)){
			Integer tmp = w.get(count);
			w.set(count,r.get(r.size()-1));
			r.set(r.size()-1,tmp);
			count++;
		}
		System.out.println(count);
		sc.close();
	}

	static boolean check(List<Integer> r) {
		Collections.sort(r);
		for (int i = 1; i < r.size(); i++) {
			if(r.get(0)!=0 || r.get(i)!=r.get(i-1)+1) {
				return false;
			}
		}
		return true;
	}

}