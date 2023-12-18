import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[3 * n];
		for (int i = 0; i < 3 * n; i++) {
			arr[i] = sc.nextInt();
		}
		PriorityQueue<Integer> front = new PriorityQueue<>();
		long frontValue = 0;
		long[] frontValues = new long[n + 1];
		PriorityQueue<Integer> reer = new PriorityQueue<Integer>(new Comparator<Integer>(){
		public int compare(Integer i1, Integer i2) {
			return i2.intValue() - i1.intValue();
		}
		});
		long reerValue = 0;
		long[] reerValues = new long[n + 1];
		for (int i = 0; i < 2 * n; i++) {
			front.add(arr[i]);
			frontValue += arr[i];
			reer.add(arr[3 * n - i - 1]);
			reerValue += arr[3 * n - i - 1];
			if (i >= n) {
				frontValues[i - n] = frontValue - arr[i];
				frontValue -= front.poll();
				reerValues[i - n] = reerValue - arr[3 * n - i - 1];
				reerValue -= reer.poll();
			}
		}
		frontValues[n] = frontValue;
		reerValues[n] = reerValue;
		long max = Long.MIN_VALUE;
		for (int i = 0; i <= n; i++) {
			max = Math.max(max, frontValues[i] - reerValues[n - i]);
		}
		System.out.println(max);
	}
}
