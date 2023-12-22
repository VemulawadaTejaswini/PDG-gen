import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] values = null;
		int cnt = s.nextInt();
		values = new int[cnt];
		int i = 0;
		for(int j=0 ; j<cnt ; j++){
			values[i] = s.nextInt();
			i++;
		}
		solve(values);
	}

	public static void solve(int[] values) {
		int mini = values[0];
		int max = Integer.MIN_VALUE;

		for(int i=1 ; i<values.length ; i++) {
			max = Math.max(values[i] - mini, max);
			mini = Math.min(mini, values[i]);
		}
		System.out.println(max);
	}
}