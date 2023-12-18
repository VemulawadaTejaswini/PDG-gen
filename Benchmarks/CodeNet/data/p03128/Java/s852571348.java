import java.util.*;

public class Main {
	public static void main(String[] args) {
		Integer[] cost_array = {2,5,5,4,5,6,3,7,6};
		List<Integer> cost = Arrays.asList(cost_array);

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		ArrayList<Integer> aArrayList = new ArrayList<>();

		for (int i=0; i<m; i++){
			aArrayList.add(Integer.parseInt(sc.next()));
		}

		String[] dp = new String[n+1];
		for (int i=1; i<10; i++){
			if (aArrayList.contains(i)){
				dp[cost_array[i-1]] = String.valueOf(i);
			}
		}

		for (int i = 1; i <= n; i++) {
			ArrayList<String> temps = new ArrayList<>();
			if (dp[i] != null){
				String temp1 = dp[i];
				char tempArray[] = temp1.toCharArray();
				Arrays.sort(tempArray);
				String temp2 = String.copyValueOf(tempArray);
				temps.add( new StringBuilder(temp2).reverse().toString());
			}

			for (int a : aArrayList) {
				if (i - cost.get(a-1) > 0){
					if (dp[i - cost.get(a-1)] != null){
						String temp1 = dp[i - cost.get(a-1)] + Integer.toString(a);
						char tempArray[] = temp1.toCharArray();
						Arrays.sort(tempArray);
						String temp2 = String.copyValueOf(tempArray);
						temps.add( new StringBuilder(temp2).reverse().toString());
					}
				}
			}
			String max = "";
			for (String s : temps) {
				if (max.length() < s.length()){
					max = s;
				}else if (max.length() == s.length()){
					for (int j=0; j<s.length(); j++){
						if (Character.getNumericValue(max.charAt(j)) < Character.getNumericValue(s.charAt(j))){
							max = s;
							break;
						}else if (Character.getNumericValue(max.charAt(j)) > Character.getNumericValue(s.charAt(j))){
							break;
						}
					}
				}
			}
			if (max.length() != 0){
				dp[i] = max;
			}
		}
		System.out.println(dp[n]);
	}
}
