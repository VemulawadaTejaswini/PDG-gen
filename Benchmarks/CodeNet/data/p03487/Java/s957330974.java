import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<Integer> bool = new ArrayList<Integer>();

		Map<Integer, Integer> list = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			int l = scan.nextInt();

			if(list.get(l) == null){
				list.put(l, 1);
			}else{
				list.put(l, list.get(l)+1);
			}
			if(!bool.contains(l)){
				bool.add(l);
			}
		}
		int ans =0;

		for(int k : bool){
			if(list.get(k) > k){
				ans += Math.min(list.get(k), list.get(k) - k);
			}else if(list.get(k) < k){
				ans += list.get(k);
			}
		}
		System.out.println(ans);
	}
}