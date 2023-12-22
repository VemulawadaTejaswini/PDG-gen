import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> dict = new HashSet<Integer>();
		int hash, n;
		String order, tmp;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			order = sc.next();
			if (order.equals("insert")) {
				tmp = sc.next();
				hash = tmp.hashCode();
				dict.add(hash);
			} else {
				tmp = sc.next();
				hash = tmp.hashCode();
				if (dict.contains(hash)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}