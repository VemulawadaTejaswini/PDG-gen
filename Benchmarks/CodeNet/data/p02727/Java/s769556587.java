import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		Apple[] all = new Apple[(int)(A+B+C)];
		Apple[] red = new Apple[(int)A];
		Apple[] green = new Apple[(int)B];
		int r = 0;
		int g = 0;
		for (int i = 0; i < A+B+C; i++) {
			long x = sc.nextLong();
			Apple a;
			if (i < A) {
				a = new Apple(0, x);
				red[r] = a;
				r++;
			} else if (i < A+B) {
				a = new Apple(1, x);
				green[g] = a;
				g++;
			} else {
				a = new Apple(2, x);
			}
			all[i] = a;
		}
		Arrays.sort(all);
		int j = all.length-1;
		int count = 0;
		long ans = 0L;
		int x = 0;
		int y = 0;
		while (X+Y > count) {
			Apple a = all[j];
			ans += a.data;
			if (a.type == 0)  {
				x++;
			} else if (a.type == 1) {
				y++;
			}
			j--;
			count++;
		}
		if (x > X) {
			Arrays.sort(red);
			for (int i = 0; i < x-X; i++) {
				ans -= red[i].data;
			}
			count = 0;
			Arrays.sort(green);
			for (int i = green.length-y-1; count < x-X; i--) {
				ans += green[i].data;
				count++;
			}
		} 
		if (y > Y) {
			Arrays.sort(green);
			count = 0;
			for (int i = 0; i < y-Y;i++) {
				ans -= green[i].data;
				count++;
			}
			Arrays.sort(red);
			count = 0;
			for (int i = red.length-x-1; count < y-Y; i--) {
				ans += red[i].data;
				count++;
			}
		}
		System.out.println(ans);
	}
	static class Apple implements Comparable<Apple> {

		int type;
		long data;
		public Apple(int t, long d){
			type = t;
			data = d;
		}
		public int compareTo(Apple a) {
			return (int)(this.data - a.data);
		}
	}
}