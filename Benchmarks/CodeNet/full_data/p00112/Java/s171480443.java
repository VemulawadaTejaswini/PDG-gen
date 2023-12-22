import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			int cnt = s.nextInt();
			if(cnt==0)
				break;
			int[] times = new int[cnt];
			for(int i=0 ; i<cnt ; i++) {
				times[i] = s.nextInt();
			}
			Arrays.sort(times);
			System.out.println(solve(times));
		}
	}

	public static long solve(int[] times) {
		long sumWaitTime = 0;
		long waitT = 0;
		for(int i=0 ; i<times.length-1 ; i++) {
			waitT += times[i];
			sumWaitTime += waitT;
		}
		return sumWaitTime;
	}
}