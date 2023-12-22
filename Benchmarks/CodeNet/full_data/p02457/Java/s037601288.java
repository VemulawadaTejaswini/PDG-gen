import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			TreeSet<Integer> s = new TreeSet<>();
			for(int i = 0; i < q; i++) {
				int query = sc.nextInt();
				switch(query) {
				case 0:
					s.add(sc.nextInt());
					System.out.println(s.size());
					break;
				case 1:
					System.out.println(s.contains(sc.nextInt())?"1":"0");
					break;
				case 2:
					s.remove(sc.nextInt());
					break;
				case 3:
					Set<Integer> sub = s.subSet(sc.nextInt(), true, sc.nextInt(), true);
					for (Integer e : sub) System.out.println(e);
				}
			}
		}
	}
}
