import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> abc = new HashSet<>();

		for (int i=0; i<3; i++) {
			int num = sc.nextInt();
			abc.add(num);
		}
		if (abc.size() == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
