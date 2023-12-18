import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		long k = sc.nextInt();
		ArrayList<Unit> list = new ArrayList<>();
		char prev = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
		    if (prev == arr[i]) {
		        len++;
		    } else {
		        list.add(new Unit(prev, len));
		        prev = arr[i];
		        len = 1;
		    }
		}
		list.add(new Unit(prev, len));
		if (list.size() == 1) {
		    System.out.println(list.get(0).length * k / 2);
		    return;
		}
		Unit first = list.get(0);
		Unit last = list.get(list.size() - 1);
		long ans = 0;
		if (first.c == last.c) {
		    ans += (first.length + last.length) / 2 * (k - 1);
		    ans += first.length / 2;
		    ans += last.length / 2;
		    list.remove(list.size() - 1);
		    list.remove(0);
		}
		for (Unit u : list) {
		    ans += u.length / 2 * k;
		}
		System.out.println(ans);
	}
	
	static class Unit {
	    char c;
	    int length;
	    public Unit(char c, int length) {
	        this.c = c;
	        this.length = length;
	    }
	}
}
