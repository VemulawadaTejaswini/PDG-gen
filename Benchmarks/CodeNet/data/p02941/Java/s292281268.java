
import java.util.ArrayDeque;
import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] begin = new int[n];
		int[] end = new int[n];
		for (int i=0;i<n;i++) {
			begin[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			end[i]=sc.nextInt();
		}
		
		long count = 0;
		
		ArrayDeque<Integer> check = new ArrayDeque<>();
		
		for (int i=0;i<n;i++) {
			check.offer(i);
		}
		while (!check.isEmpty()) {
			int i = check.poll();
			int times = process(end, begin, i);
			if (times>0) {
				count += times;
				check.offer(i==0 ? n-1 : i-1);
				check.offer(i==n-1 ? 0 : i+1);
			}
		}
		
		boolean same = true;
		for (int i=0;i<n;i++) {
			if (begin[i]!=end[i]) {
				same=false;
				break;
			}
		}
		if (same) {
			System.out.println(count);
		} else {
			System.out.println(-1);
		}
	}
	
	static int process(int[] end, int[] begin, int i) {
		int left = (i==0 ? end[end.length-1] : end[i-1]);
		int right = (i==end.length-1 ? end[0] : end[i+1]);

		if (end[i]>left+right && end[i]>begin[i]) {
			int ret = (end[i]-begin[i])/(left+right);
			end[i]-=((left+right)*ret);
			return ret;
		} else {
			return 0;
		}
	}
}