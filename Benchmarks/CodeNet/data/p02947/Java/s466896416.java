import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		for(int i=0; i<n; i++){
			strs[i] = sc.next();
		}
		Map<String, Integer> map = new HashMap<>();
		for(String str: strs){
			char[] chs = new char[str.length()];
			for(int i=0; i<str.length(); i++){
				chs[i] = str.charAt(i);
			}
			Arrays.sort(chs);
			String sorted = new String(chs);
			Integer count = map.get(sorted);
			if(count == null) {
				map.put(sorted, 1);
			} else {
				map.put(sorted, count+1);
			}
		}
		long ans = 0;
		for (long i : map.values()) {
			if(i>1){
				ans += i*(i-1)/2;
			}
		}
		System.out.println(ans);
	}
}
