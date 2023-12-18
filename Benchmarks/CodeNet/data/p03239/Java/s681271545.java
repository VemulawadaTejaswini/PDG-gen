import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] c = new int[n];
		int[] tn = new int[n];
		for(int i = 0; i < n; i++){
			c[i] = in.nextInt();
			tn[i] = in.nextInt();
		}
		int result = 1001;
		
		for(int i = 0; i < n; i++){
			if(tn[i] <= t && c[i] < result)
				result = c[i];
		}
		
		if(result == 1001)
			System.out.println("TLE");
		else
			System.out.println(result);

	}

}