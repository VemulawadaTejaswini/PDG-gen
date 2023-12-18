import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isNotPrimes = new boolean[100001];
		isNotPrimes[0] = true;
		isNotPrimes[1] = true;
		for (int i = 2; i < isNotPrimes.length; i++) {
		    if (!isNotPrimes[i]) {
		        for (int j = 2; i * j < isNotPrimes.length; j++) {
		            isNotPrimes[i * j] = true;
		        }
		    }
		}
		int[] counts = new int[100001];
		for (int i = 1; i < counts.length; i++) {
		    counts[i] = counts[i - 1];
		    if (!isNotPrimes[i] && !isNotPrimes[(i + 1) / 2]) {
		        counts[i]++;
		    }
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    sb.append(- counts[sc.nextInt() - 1] + counts[sc.nextInt()]).append("\n");
		}
        System.out.print(sb);
    }
}

