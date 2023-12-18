import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] l = new int[n];
		int min = 2000000000;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			l[i] = sc.nextInt();
			min = Math.min(x[i]-l[i],min);
		}
		int now = min-1; int sum = 0;
		Time[] time = new Time[n];
		for(int i = 0; i < n; i++) {
			time[i] = new Time(x[i]-l[i], x[i]+l[i]);
		}

		Arrays.sort(time, new Comparator<Time>() {
			public int compare(Time t1, Time t2) {
				return t1.end - t2.end;
			}
		});

		for(int i = 0; i < n; i++) {
			if(now <= time[i].start) {
				now = time[i].end;
				sum += 1;
			}
		}

		System.out.println(sum);

		sc.close();
	}
	public static class Time {
		int start; int end;
		Time(int s, int e) {
			this.start = s; this.end = e;
		}
	}
}