import java.util.*;

public class Main {
    static TreeSet<Integer> all = new TreeSet<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextLine().charAt(0) - '0';
		int[] base = new int[n];
		for (int i = 0; i < n; i++) {
		    base[i] = i + 1;
		}
		make(0, 0, base, n);
		int x = 0;
		char[] input = sc.nextLine().toCharArray();
		for (int i = 0; i < input.length; i += 2) {
		    x *= 10;
		    x += input[i] - '0';
		}
		Integer before = all.lower(x);
		if (before != null) {
		    System.out.println(toString(before,n));
		}
		System.out.println(input);
		Integer next = all.higher(x);
		if (next != null) {
		    System.out.println(toString(next, n));
		}
	}
	
	static void make(int value, int mask, int[] base, int size) {
	    if (mask == (1 << size) - 1) {
	        all.add(value);
	        return;
	    }
	    value *= 10;
	    for (int i = 0; i < size; i++) {
	        if ((mask & (1 << i)) != 0) {
	            continue;
	        }
	        make(value + base[i], mask | (1 << i), base, size);
	    }
	}
	
	static char[] toString(int x, int size) {
	    char[] ans = new char[size * 2 - 1];
	    Arrays.fill(ans, ' ');
	    int idx = ans.length - 1;
	    for (int i = 0; i < size; i++) {
	        ans[idx] = (char)(x % 10 + '0');
	        x /= 10;
	        idx -= 2;
	    }
	    return ans;
	}
}

