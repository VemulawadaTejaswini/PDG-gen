import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] n = Arrays.stream(sc.nextLine().split("")).mapToLong(Long::parseLong).toArray();
		long c = Arrays.stream(n).filter(a -> a == 2).count();
		System.out.println(c);
	}

}
