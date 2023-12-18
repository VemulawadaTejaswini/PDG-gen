import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String[] str = new String[k];
		for (int i = 0 ; i < k ; i ++){
			str[i] = sc.next();
		}
		long answer = 0 ;
		ArrayList<String> ay_st = new ArrayList<>();
		for (int i = 0 ; i < k ; i ++){
			char[] c = str[i].toCharArray();
			Arrays.sort(c);
			str[i] = new String(c);
			
			ay_st.add(str[i]);
		}
		
		Map<String, Integer> map = new HashMap<>();
		for (String s : ay_st) {
		    map.merge(s, 1, Integer::sum);
		}
		
		for (String key : map.keySet()) {
			
			if (map.get(key) > 1) {
				
				answer = answer + (map.get(key)-1)*map.get(key)/2;
			}
			
		}
		
		System.out.println(answer);
	}
}