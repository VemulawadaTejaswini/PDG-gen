import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long p[] = new long[num];
		for(int i = 0; i < num; i ++) {
			p[i] = sc.nextLong();
		}
		int count = 0;
		for(int i = 1; i < num - 1; i ++) {
			if(p[i] > p[i - 1] && p[i] < p[i + 1]) { count ++; }
			if(p[i] < p[i - 1] && p[i] > p[i + 1]) { count ++; }
		}
		System.out.println(count);
	}
}