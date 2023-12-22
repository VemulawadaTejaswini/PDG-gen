import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> dict = new HashSet<Integer>();
		int n;
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String order = sc.next();
			String name = sc.next();
			int hash = 0;
			for (int j = 0; j < name.length(); j++) {
				switch (name.charAt(j)) {
					case 'A':
						hash += 10;
						break;
					case 'C':
						hash += 1000;
						break;
					case 'G':
						hash += 100000;
						break;
					case 'T':
						hash += 10000000;
						break;
				}
			}
			
			if (order.equals("insert")) {
				dict.add(hash);
			} else {
				if (dict.contains(hash)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}