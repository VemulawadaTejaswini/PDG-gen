import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			Set<Integer> s = new HashSet<>();
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
				}
			}
		}
	}
}
