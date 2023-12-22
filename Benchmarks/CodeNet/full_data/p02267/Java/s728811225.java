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
			for(int s: slist){
				if(q == s){
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
		
	}
}

