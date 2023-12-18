import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long T = stdIn.nextLong();
		long[] a = new long[N];
		long[] b = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = stdIn.nextLong();
			b[i] = stdIn.nextLong();
		}
		
		long time = 0;
		int count = 0;
		while(time <= T+0.5 && count < N) {
			time += 1;
			long min = a[0]*time+b[0];
			int index = 0;
			for(int i = 1; i < N; i++) {
				if(a[i]*time+b[i] < min) {
					min = a[i]*time+b[i];
					index = i;
				}
				else if(a[i]*time+b[i] == min) {
					if(a[index] < a[i]) {
						index = i;
					}
				}
			}
			a[index] = (long)1e9;
			b[index] = (long)1e9;
			
			time += min;
			if(time <= T+0.5) {
				count++;
			}
			else {
				break;
			}
		}
		
		System.out.println(count);

	}

}