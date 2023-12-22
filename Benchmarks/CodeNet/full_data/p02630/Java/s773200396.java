import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			long sum = 0;
			Map<Integer,Integer> map = new HashMap<>();
			for(int num : nums) {
				map.merge(num, 1, (v1,v2)->v1+v2);
				sum += num;
			}

			br.readLine();

			String s = null;
			while((s=br.readLine()) != null) {
				int[] convs=Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
				int prevKey = convs[0];
				int newKey = convs[1];


				// conv
				Integer cnt = map.remove(prevKey);
				if(cnt != null) {
					sum -= (cnt * prevKey);
					sum += (cnt * newKey);

					// merge
					map.merge(newKey, cnt, (v1,v2)-> v1+v2);

				}
				System.out.println(sum);
			}
		} catch(Exception e) {}

	}
}