import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		int result = solve(k, data);
		System.out.println(result);
	}

	private static int solve(int k, int[] data) {
		// TODO Auto-generated method stub
		Arrays.sort(data);
		long sum = 0;
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			sum+=data[i];
			if(sum>=k) break;
		}
		if(sum<k) return data.length;
		for(int i=0;i<data.length;i++){
			if(sum-data[i]>=k)
				count++;
		}
		return count;

	}
}
