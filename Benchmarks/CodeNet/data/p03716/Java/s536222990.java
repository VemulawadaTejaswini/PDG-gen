import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[3 * N];
		for(int i = 0; i < 3 * N; i++) {
			a[i] = sc.nextLong();
		}
		
		Queue<Long> queue1 = new PriorityQueue<>();
		long sum1 = 0;
		for(int i = 0; i < N; i++) {
			queue1.add(a[i]);
			sum1 += a[i];
		}
		
		Queue<Long> queue2 = new PriorityQueue<>(new MyComparator());
		long sum2 = 0;
		for(int i = 2 * N; i < 3 * N; i++) {
			queue2.add(a[i]);
			sum2 += a[i];
		}
		
		long ans_ary[] = new long[N + 1];
		ans_ary[0] += sum1;
		ans_ary[N] -= sum2;
		for(int k = 0; k < N; k++) {
			queue1.add(a[N + k]);
			sum1 += a[N + k];
			sum1 -= queue1.poll();
			ans_ary[k + 1] += sum1;
			
			queue2.add(a[2 * N - 1 - k]);
			sum2 += a[2 * N - 1 - k];
			sum2 -= queue2.poll();
			ans_ary[N - k - 1] -= sum2;
		}
		long ans = Long.MIN_VALUE;
		for(int i = 0; i <= N; i++) {
			ans = Math.max(ans, ans_ary[i]);
		}
		System.out.println(ans);
	}
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
         
        long num1 = (long)obj1;
        long num2 = (long)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}