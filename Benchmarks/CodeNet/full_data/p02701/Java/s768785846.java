import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String strs;
		int value = 0;
		int ans = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();

		for(int i=1;i<=N;i++){
			strs = sc.next();	
			if (map.containsKey(strs)){
				value = map.get(strs)+1;
				map.put(strs, value);
			}
			else{
				map.put(strs, 1);
			}

		}

		for (String key : map.keySet()) {
			ans=ans+1;
		}
		System.out.println(ans);
    }
}