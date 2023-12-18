import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5;
		long minute[] = new long[num];
		long rest[] = new long[num];
		long time = 0;
		for(int i = 0; i < num; i ++) {
			minute[i] = sc.nextLong();
			long need = (long)Math.ceil(minute[i] / 10.0) * 10;
			rest[i] = need - minute[i];
			time += need;
		}
		Arrays.sort(rest);
		time -= rest[num - 1];
		System.out.println(time);
	}
}