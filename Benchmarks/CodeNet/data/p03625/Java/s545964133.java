import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long ary[] = new long[N];
		
		for(int i = 0; i < N; i++) {
			ary[i] = sc.nextLong();
		}
		
		Arrays.sort(ary);
		
		int flag = 0;
		long sideLength1 = 0;
		long sideLength2 = 0;
		
		for(int i = N - 1; i > 0; i--) {
			
			if(flag == 2) {
				break;
			}
			
			if(ary[i] == ary[i - 1] && flag == 1) {
				sideLength2 = ary[i];
				flag++;
				i--;
			}
			
			if(ary[i] == ary[i - 1] && flag == 0) {
				sideLength1 = ary[i];
				flag++;
				i--;
			}
		}
		
		System.out.println(sideLength1 * sideLength2);
	}
}
