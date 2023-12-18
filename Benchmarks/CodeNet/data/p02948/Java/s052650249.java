import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		Sal[] ent = new Sal[N];
		for (int i = 0; i < N; i++) {
			int day = scan.nextInt();
			int sal = scan.nextInt();
			ent[i] = new Sal(day, sal);
		}
		Arrays.sort(ent, new Comparator<Sal>() {
			public int compare(Sal d1, Sal d2) {
				return d1.getDay() - d2.getDay();
			}
		});
		Arrays.sort(ent, new Comparator<Sal>() {
			public int compare(Sal d1, Sal d2) {
				return d1.getSal() - d2.getSal();
			}
		});

		int day = 0;
		int sal = 0;

		for (int i = N - 1; i >= 0; i--) {
			int aDay = ent[i].getDay();
			if (day + aDay > M) {
				continue;
			}
			sal += ent[i].getSal();
			day++;
		}
		System.out.println(sal);
	}

	static class Sal {
		private int day;
		private int sal;
		public Sal(int day, int sal) {
			this.day = day;
			this.sal = sal;
		}
		public int getDay() {
			return day;
		}
		public int getSal() {
			return sal;
		}
	}
}
