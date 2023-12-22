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
			solve(times);
		}
	}

	public static void solve(int[] times) {
		int sumWaitTime = 0;
		int waitT = 0;
		for(int i=0 ; i<times.length-1 ; i++) {
			waitT += times[i];
			sumWaitTime += waitT;
		}
		System.out.println(sumWaitTime);
	}
}