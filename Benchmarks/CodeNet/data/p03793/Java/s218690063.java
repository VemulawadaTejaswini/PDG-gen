import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			List<Character> chars = new ArrayList<>();
			for (int j = 0; j < r - l + 1; j++) {
				chars.add(s[l - 1 + j]);
			}
//			chars.forEach(System.out::print);
//			System.out.println();
			while (chars.size() != 0 && changeI(chars));
			if (chars.size() == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			} ;
		}
	}
	private static boolean changeI(List<Character> chars) {
		Optional<Integer> pointOp = sameI(chars);
		if (!pointOp.isPresent()) {
			return false;
		} 
		int point = pointOp.get();
		if (chars.get(point) == 'z') {
			chars.remove(point);
			chars.remove(point);
		} else {
			int a = chars.get(point) + 1;
			chars.set(point, (char) a);
			chars.remove(point + 1);
		}
		return true;
	}

	private static Optional<Integer> sameI(List<Character> a) {
		return IntStream.range(0, a.size() - 1)
			.boxed()
			.filter(e -> a.get(e) == a.get(e + 1))
			.findFirst();
	}
}
