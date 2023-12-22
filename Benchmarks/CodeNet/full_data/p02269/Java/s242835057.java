import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> dict = new TreeSet<String>();
		int n;
		String order, tmp;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			order = sc.next();
			if (order.equals("insert")) {
				tmp = sc.next();
				dict.add(tmp);
			} else {
				tmp = sc.next();
				if (dict.contains(tmp)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}