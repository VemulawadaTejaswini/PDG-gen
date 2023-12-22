
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static class LenComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
	}
	static long solve(String S[]){
		Arrays.sort(S, new LenComparator());
		Map<String, int[]> map = new HashMap<String, int[]>();
		long tot = 0;
		for(String s : S){
			int vis[] = new int[26];
			vis[s.charAt(0) - 'a'] = 1; 
			for(int i = 1; i <= s.length() ; ++i){
				String sub = s.substring(i);
				if(map.containsKey(sub)){
					int[] arr = map.get(sub);
					for(int j = 0 ; j < 26 ; ++j){
						tot += arr[j] * vis[j];
					}
				}
				if(i < s.length()){
					vis[s.charAt(i) - 'a'] = 1;					
				}
			}
			String suffix = s.substring(1);
			if(!map.containsKey(suffix)){
				map.put(suffix, new int[26]);
			}
			char s0 = s.charAt(0);
			int arr[] = map.get(suffix);
			arr[s0 - 'a']++;
		}
		return tot;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		String S[] = new String[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.next();			
		}
		long ret = solve(S);
		System.out.println(ret);
	}
}
