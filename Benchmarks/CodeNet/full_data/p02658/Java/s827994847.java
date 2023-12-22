import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long sum = 1;
		long[] arr = new long[t];
		for(int i = 0; i < t; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		for(int i = 0; i < t; i++) {
			sum *= arr[i];
			if(sum == 0)
				break;
			if(sum > (long)1e18 && arr[i] > 0)
				break;
		}
		if(sum > (long)1e18)
			System.out.println(-1);
		else
			System.out.println(sum);
	}
}