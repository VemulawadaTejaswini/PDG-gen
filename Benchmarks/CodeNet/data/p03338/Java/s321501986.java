import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int N = sc.nextInt();
		String M = sc.next();
		for (int string_cnt = 0; string_cnt < N; string_cnt++ ){
			String  target = M.substring(string_cnt,string_cnt+1);
			if (map.containsKey(target)){
				map.put(target, map.get(target) + 1);
			}
			else{
				map.put(target,1);
			}
		}
		double ans = Math.ceil(Collections.max(map.values()) / 2);
		System.out.println(ans);


}}