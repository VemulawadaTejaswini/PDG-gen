import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		int odd[] = new int[100000];
		int even[] = new int[100000];
		Arrays.fill(odd, 0);
		Arrays.fill(even, 0);
		
		for(int i = 0; i < n / 2; i++) {
			int num = sc.nextInt();
			odd[num]++;
			num = sc.nextInt();
			even[num]++;
		}
		
		int max_odd = 0;
		int max_odd_num = 0;
		int next_max_odd = 0;
		int max_even = 0;
		int max_even_num = 0;
		int next_max_even = 0;
		for(int i = 0; i < 100000; i++) {
			if(odd[i] > max_odd) {
				next_max_odd = max_odd;
				max_odd = odd[i];
				max_odd_num = i;
			}
			if(even[i] > max_even) {
				next_max_even = max_even;
				max_even = even[i];
				max_even_num = i;
			}
		}
		if(max_odd_num == max_even_num) {
			if(next_max_odd > next_max_even) {
				System.out.println(n - max_even - next_max_odd);
			} else {
				System.out.println(n - next_max_even - max_odd);
			}
		} else {
			System.out.println(n - max_even - max_odd);
		}
	}
}
