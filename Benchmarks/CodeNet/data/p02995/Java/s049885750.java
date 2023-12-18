import java.util.*;

public class Main{
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		long A = $.nextLong() - 1, B = $.nextLong(), C = $.nextLong(), D = $.nextLong(), lcm = LCM(C, D);
		System.out.println(B + " - " +  A);
		System.out.println(B / C + " - " + A / C);
		System.out.println(B / D + " - " + A / C);
		System.out.println(B / (C * D) + " - " + A / (C * D));
		System.out.println((B - A) - (B / C - A / C) - (B / D - A / C) + ((B / lcm) - A / lcm));
	}
	public static long LCM(long a, long b){
		long A = a, B = b;
		if (a < b){
			long c = a;
			a = b;
			b = c;
		}
		while(b > 0){
			a -= b;
			if (a < b){
				long c = a;
				a = b;
				b = c;
			}
		}
		return A * B / a
		/*
		4 9 2 3 -> 2
		10 40 6 8 -> 23
		314159265358979323 846264338327950288 419716939 937510582 -> 532105071133627368
		*/;
	}
}
