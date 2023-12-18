import java.util.*;

public class Main {
	public static void main(String[] args) {
		Integer[] cost_array = {2,5,5,4,5,6,3,7,6};
		List<Integer> cost = Arrays.asList(cost_array);

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		List<Integer> aArray = new ArrayList<>();

		for (int i=0; i<m; i++){
			aArray.add(Integer.parseInt(sc.next()));
		}

		String[] dp = new String[n+1];

		dp[0] = "";

		for (int i=0; i<=n; i++){
			for (int a: aArray){
				if (cost.get(a-1) <= i && dp[i-cost.get(a-1)] != null){
					dp[i] = func2(dp[i-cost.get(a-1)]+a, dp[i]);
				}
			}
		}

		System.out.println(dp[n]);
	}

	public static String func2(String x, String y) {
		if (y == null){
			return x;
		}else if (x.length() > y.length()){
			return x;
		}else if (x.length() < y.length()){
			return y;
		}else {
			for (int i=0; i<x.length(); i++){
				if (x.charAt(i) > y.charAt(i)){
					return x;
				}else if (x.charAt(i) < y.charAt(i)){
					return y;
				}
			}
			return x;
		}
	}
}