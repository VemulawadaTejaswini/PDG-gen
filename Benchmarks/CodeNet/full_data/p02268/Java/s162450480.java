import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
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
			if(binarySearch(slist, q, Comparator.naturalOrder()) != -1){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static <T> int binarySearch(List<T> list, T target, Comparator<T> comp){
		int left = 0;
		int right = list.size();
		while(left < right){
			int mid = (left + right) / 2;
			int c = comp.compare(list.get(mid), target);
			if(c == 0){
				return mid;
			}else if(c < 0){
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		return -1;
	}
}
