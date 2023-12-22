import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			Map<Integer,Integer> map = new HashMap<>();
			AtomicLong sum = new AtomicLong(0L);
			Stream.of(br.readLine().split(" ")).map(Integer::valueOf).forEach(num -> {
				map.merge(num, 1, (v1,v2)->v1+v2);
				sum.addAndGet(num);
			});

			br.readLine();

			String s = null;
			while((s=br.readLine()) != null) {
				System.out.println("#" + s);

				int[] convs=Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
				int prevKey = convs[0];
				int newKey = convs[1];


				// conv
				Integer cnt = map.remove(prevKey);
				if(cnt != null) {
					sum.getAndAdd(-(cnt * prevKey));
					sum.getAndAdd(cnt * newKey);

					// merge
					map.merge(newKey, cnt, (v1,v2)-> v1+v2);
				}
				System.out.println(sum);
			}
		} catch(Exception e) {}

	}
}