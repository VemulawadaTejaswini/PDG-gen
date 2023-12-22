import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if (arr[i] == '1') {
		        count++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		if (count == 0) {
		    for (int i = 0; i < n; i++) {
		        sb.append(1).append("\n");
		    }
		} else if (count == 1) {
		    for (int i = 0; i < n; i++) {
		        if (arr[i] == '1') {
		            sb.append(0).append("\n");
		        } else {
		            if (arr[n - 1] == '1') {
		                sb.append(2).append("\n");
		            } else {
		                sb.append(1).append("\n");
		            }
		        }
		    }
		} else {
		    int plus = count + 1;
		    int minus = count - 1;
		    int[] plusMods = new int[n];
		    int[] minusMods = new int[n];
		    int plusValue = 0;
		    int minusValue = 0;
		    plusMods[0] = 1 % plus;
		    minusMods[0] = 1 % minus;
		    if (arr[n - 1] == '1') {
		        plusValue += plusMods[0];
		        minusValue += minusMods[0];
		    }
		    for (int i = 1; i < n; i++) {
		        plusMods[i] = (plusMods[i - 1] << 1) % plus;
		        minusMods[i] = (minusMods[i - 1] << 1) % minus;
		        if (arr[n - 1 - i] == '1') {
		            plusValue = (plusValue + plusMods[i]) % plus;
		            minusValue = (minusValue + minusMods[i]) % minus;
		        }
		    }
		    for (int i = 0; i < n; i++) {
		        int ans;
		        if (arr[i] == '1') {
		            ans = get((minusValue - minusMods[n - 1 - i] + minus) % minus);
		        } else {
		            ans = get((plusValue + plusMods[n - 1 - i]) % plus);
		        }
		        sb.append(ans).append("\n");
		    }
		}
		System.out.print(sb);
	}
	
	static HashMap<Integer, Integer> set = new HashMap<>();
	
	static int get(int value) {
	    if (!set.containsKey(value)) {
	        if (value == 0) {
	            set.put(value, 1);
	        } else {
	            int count = 0;
	            int x = value;
	            while (x > 0) {
	                count += x % 2;
	                x >>= 1;
	            }
	            set.put(value, get(value % count) + 1);
	        }
	    }
        return set.get(value);
	}
}
