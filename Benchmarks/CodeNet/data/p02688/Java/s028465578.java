import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] sums = new int[n];
		for (int i = 0; i < k; i++) {
		    int num = sc.nextInt();
		    for (int j = 0; j < num; j++) {
		        sums[sc.nextInt() - 1]++;
		    }
		}
		int count = 0;
		for (int x : sums) {
		    if (x == 0) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
