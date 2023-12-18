import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 11; list.size() < n; i += 10) {
		    if (isPrime(i)) {
		        list.add(i);
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(list.get(i));
		}
		System.out.println(sb);
    }
    
    static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

