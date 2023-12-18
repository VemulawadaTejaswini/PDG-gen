import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		PriorityQueue<Integer> befQueue = new PriorityQueue<>();
		PriorityQueue<Integer> afQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
		    public int compare(Integer i1, Integer i2) {
		        return i2.intValue() - i1.intValue();
		    }
		});
		long befScore = 0;
		long afScore = 0;
		for (int i = 0; i < n * 3; i++) {
		    int x = sc.nextInt();
		    if (i < n) {
		        befQueue.add(x);
		        befScore += x;
		    } else if (i < 2 * n) {
		        arr[i - n] = x;
		    } else {
		        afQueue.add(x);
		        afScore += x;
		    }
		}
		long[] values = new long[n + 1];
		values[0] += befScore;
		values[n] -= afScore;
		for (int i = 0; i < n; i++) {
		    befQueue.add(arr[i]);
		    befScore += arr[i];
		    befScore -= befQueue.poll();
		    values[i + 1] += befScore;
		    afQueue.add(arr[n - i - 1]);
		    afScore += arr[n - i - 1];
		    afScore -= afQueue.poll();
		    values[n - i - 1] -= afScore;
		}
		Arrays.sort(values);
	    System.out.println(values[n]);
   }
}


