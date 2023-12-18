import java.util.ArrayList;
import java.util.Scanner;

public class Main { //LeGOD! - Max sequences is 
	//92378 so probably no TLE
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int Q = input.nextInt();
		int[][] query = new int[Q][4];
		for (int i = 0; i < Q; i++) {
			query[i][0] = input.nextInt();
			query[i][1] = input.nextInt();
			query[i][2] = input.nextInt();
			query[i][3] = input.nextInt();
		}
		long ans = 0;
		ArrayList<String> x = Recur(N,M);
		for (int i = 0; i < x.size(); i++) {
			String[] arr = x.get(i).split(" ");
			long curans = 0;
			for (int j = 0; j < Q; j++) {
				int A = query[j][0];
				int B = query[j][1];
				int C = query[j][2];
				int D = query[j][3];
				int cmpA = Integer.parseInt(arr[A-1]);
				int cmpB = Integer.parseInt(arr[B-1]);
				if (cmpB-cmpA==C) curans+=D; 
			}
			ans=Math.max(ans, curans);
		}
		System.out.println(ans);
	}
	public static ArrayList<String> Recur(int N, int M) {
		ArrayList<String> seq = new ArrayList<String>();
		if (N==1) {
			for (int i = 1; i <= M; i++) {
				seq.add(Integer.toString(i)+" "); //Space to prevent confusion of 1 and 10
			}
		}else {
			ArrayList<String> prev = Recur(N-1,M);
			for (int i = 0; i < prev.size(); i++) {
				String[] nums = prev.get(i).split(" ");
				int lowerbound = Integer.parseInt(nums[nums.length-1]);
				for (int j = lowerbound; j <= M; j++) {
					seq.add(prev.get(i)+Integer.toString(j)+" ");
				}
			}
		}
		return seq;
	}
}