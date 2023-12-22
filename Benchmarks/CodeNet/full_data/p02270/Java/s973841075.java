import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		List<Integer> nk = Arrays.stream(br.readLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int n = nk.get(0);
		int k = nk.get(1);
		
		List<Integer> ws = new ArrayList<>();
		for(int i = 0; i < n; i++){
			ws.add(Integer.parseInt(br.readLine()));
		}
		
		int left = 0;
		int right = 10000 * 100000;
		int mid = 0;
		while(1 <= right - left){
			mid = (left + right) / 2;
			int v = check(mid, k, ws);
			if(v < n){
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		
		System.out.println(right);
		
	}
	
	static int check(int p, int k, List<Integer> ws){
		int truck = 0;
		int t = 1;
		
		for(int i = 0; i < ws.size(); i++){
			if(p < ws.get(i)){
				return i;
			}
			if(truck + ws.get(i) <= p){
				truck += ws.get(i);
			}else{
				t++;
				if(k < t){
					return i;
				}else{
					truck = ws.get(i);
				}
			}
		}
		
		return ws.size();
	}
	
}
