import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			Set<Integer> a = new TreeSet<>();
			for(int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}
			int m = sc.nextInt();
			Set<Integer> b = new TreeSet<>();
			for(int i = 0; i < m; i++) {
				b.add(sc.nextInt());
			}

			Set<Integer> sum = new TreeSet<>(a);
			sum.addAll(b);
			Set<Integer> prod = new TreeSet<>(a);
			prod.removeIf((num) -> !b.contains(num));
			Set<Integer> prime = new TreeSet<>(sum);
			prime.removeIf(num -> prod.contains(num));

			prime.forEach(num -> System.out.println(num));
		}
	}
}
