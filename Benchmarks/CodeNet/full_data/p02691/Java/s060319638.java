import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Integer> low = new HashMap<>();
		int[] arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			int val = sc.nextInt();
			arr[i] = val;
			low.put(i - val, low.getOrDefault(i - val , 0) + 1);
		}
		int res = 0;
		for(int i = 1; i <= n; i++) {
			if(low.containsKey(arr[i] + i))
				res += low.get(arr[i] + i);
			if(i - arr[i] == i + arr[i])
				res--;
		}
		System.out.println(res);
    }
}