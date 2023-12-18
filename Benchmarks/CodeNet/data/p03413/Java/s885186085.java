import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ", n);
		ArrayList<Integer> oddIdxes = new ArrayList<>();
		ArrayList<Integer> evIdxes = new ArrayList<>();
		long oddSum = 0;
		long evSum = 0;
		long max = Integer.MIN_VALUE;
		int maxIdx = 0;
		for (int i = 1; i <= n; i++) {
		    int x = Integer.parseInt(line[i - 1]);
		    if (x > 0) {
		        if (i % 2 == 0) {
		            evSum += x;
		            evIdxes.add(i);
		        } else {
		            oddSum += x;
		            oddIdxes.add(i);
		        }
		    }
		    if (max < x) {
		        max = x;
		        maxIdx = i;
		    }
		}
		ArrayList<Integer> idxes;
		if (oddIdxes.size() <= 1 && evIdxes.size() <= 1) {
		    idxes = new ArrayList<>();
		    idxes.add(maxIdx);
		} else if (oddSum > evSum) {
		    max = oddSum;
		    idxes = oddIdxes;
		} else {
		    max = evSum;
		    idxes = evIdxes;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = n; i > idxes.get(idxes.size() - 1); i--) {
		    ans.add(i);
		}
		for (int i = idxes.size() - 1; i > 0; i--) {
		    int left = idxes.get(i - 1);
		    int right = idxes.get(i);
		    while (right - left > 2) {
		        ans.add(right - 1);
		    }
		    right -= 2;
		    ans.add(left + 1);
		}
		for (int i = 1; i < idxes.get(0); i++) {
		    ans.add(1);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		sb.append(ans.size()).append("\n");
		for (int x : ans) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
    }
}

