import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int ary[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			ary[i] = sc.nextInt();
		}
		
		Arrays.sort(ary);
		
		int flag = 0;
		boolean tempFlag = false;
		int sideLength1 = 0;
		int sideLength2 = 0;
		
		for(int i = N - 1; i > 0; i--) {
			if(tempFlag) {
				tempFlag = false;
				continue;
			}
			
			if(flag == 2) {
				break;
			}
			
			if(ary[i] == ary[i - 1] && flag == 1) {
				sideLength2 = ary[i];
				flag++;
				tempFlag = true;
			}
			
			if(ary[i] == ary[i - 1] && flag == 0) {
				sideLength1 = ary[i];
				flag++;
				tempFlag = true;
			}
		}
		
		System.out.println(sideLength1 * sideLength2);
	}
}
