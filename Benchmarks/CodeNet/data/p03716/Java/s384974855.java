import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[3*n];
		for(int i = 0; i < 3*n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long[] sum = new long[3*n];
		long curr = 0;
		PriorityQueue<Long> q = new PriorityQueue<>();
		for(int i = 0; i < n; i++){
			curr += arr[i];
			q.add(arr[i]);
		}
		sum[n] = curr;
		for(int i = n; i < 3*n-1; i++){
			q.add(arr[i]);
			long r = q.poll();
			curr += arr[i]; curr -= r;
			sum[i+1] = curr;
		}
		q = new PriorityQueue<>();
		curr = 0;
		for(int i = 3*n-1; i >= 2*n; i--){
			curr += arr[i];
			q.add(-arr[i]);
		}
		sum[2*n] -= curr;
		for(int i = 2*n-1; i >= 0; i--){
			q.add(-arr[i]);
			long r = -q.poll();
			curr += arr[i]; curr -= r;
			sum[i] -= curr;
		}
		long max = Long.MIN_VALUE;
		for(int i = n; i <= 2*n; i++){
			max = Long.max(max, sum[i]);
		}
		System.out.println(max);
	}

}
