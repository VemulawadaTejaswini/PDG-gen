import java.util.*;
class Main {
	public static int getCvalue(int n, int m) {
			if(n < 2) {
				return 0;
			}
			else {
				int k = n - m;
				int a = 1;
				while(n > k) {
					a *= (n--);
					//System.out.println("a " + a);
				}
				return a/2;
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> recMap = new HashMap<>();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			arr[i] = a;
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for(int j : map.keySet()) {
			if(!recMap.containsKey(map.get(j))) {
				recMap.put(map.get(j), getCvalue(map.get(j), 2));	
			}
			if(!recMap.containsKey(map.get(j)-1)) {
				recMap.put(map.get(j)-1, getCvalue(map.get(j)-1, 2));
			}
		}
		for(int i = 0; i < n; i++) {
			a = arr[i];
			int res = 0;
			for(int j : map.keySet()) {
				if(j == a) {
					res += recMap.get(j-1);
				}
				else {
					res += recMap.get(j);	
				}
			}
			System.out.println(res); 
		}
	}
}