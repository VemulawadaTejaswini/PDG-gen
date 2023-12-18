import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static long count = 0;
	
	public static long[] func(long[] ar) {
		Arrays.sort(ar);
		if (ar[0] == 0) {
			long[] result = {count, 0};
			return result;
		}
		//System.out.prlongln(Arrays.toString(ar));
		count = count + ar[0] * 3 * (ar[1] / ar[0]);
		long[] next = {ar[0], (ar[1] % ar[0])};
		return func(next);
	}
	
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String[] line = br.readLine().trim().split(" ");
		//long[] ar = Stream.of(line).mapToLong(Integer::parseLong).toArray();
		Scanner sc = new Scanner(System.in);
			long[] ar = {sc.nextLong(), sc.nextLong()};
		Arrays.sort(ar);
		ar[1] = ar[1] - ar[0];
		//System.out.prlongln(Arrays.toString(ar));
		System.out.println(func(ar)[0]);
	}
}