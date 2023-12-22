import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int sn = Integer.parseInt(br.readLine());
		List<Integer> slist = Arrays.stream(br.readLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int qn = Integer.parseInt(br.readLine());
		List<Integer> qlist = Arrays.stream(br.readLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		int count = 0;
		for(int q: qlist){
			int left = 0;
			int right = slist.size();
			while(left < right){
				int mid = (left + right) / 2;
				if(q == slist.get(mid)){
					count++;
					break;
				}else if(slist.get(mid) < q){
					left = mid + 1;
				}else{
					right = mid;
				}
			}
		}
		
		System.out.println(count);
	}
}
