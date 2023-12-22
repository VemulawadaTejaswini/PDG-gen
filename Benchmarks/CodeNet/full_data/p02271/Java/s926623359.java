import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		List<Integer> aList = Arrays.asList(br.readLine().split(" ")).stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int q = Integer.parseInt(br.readLine());
		List<Integer> mList = Arrays.asList(br.readLine().split(" ")).stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		for(int m: mList){
			if(solve(aList, 0, m)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}
	
	public static boolean solve(List<Integer> list, int startIndex, int m){
		if(m == 0){
			return true;
		}
		if(list.size() <= startIndex){
			return false;
		}
		return solve(list, startIndex + 1, m) || solve(list, startIndex + 1, m - list.get(startIndex));
	}
}
