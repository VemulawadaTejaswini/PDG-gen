import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		
		List<Long> list = new ArrayList<Long>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		long min = list.stream().min(Comparator.naturalOrder()).orElse(0l);
		double buttom = (double)n / min;
		long buttomMax = (long)Math.ceil(buttom);
		long result = buttomMax + 4;
		System.out.println(result);
	}
}