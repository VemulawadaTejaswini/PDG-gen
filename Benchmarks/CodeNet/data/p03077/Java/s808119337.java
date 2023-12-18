import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = sc.nextLong();
		
		long[] T1 = new long[2];
		T1[0] = N;
		long[] T2 = new long[2];
		long[] T3 = new long[2];
		long[] T4 = new long[2];
		long[] T5 = new long[2];
		long[] T6 = new long[2];
		
		long count = 0;
		
		do {
			T1[1] = T1[0] - Math.min(T1[0], A);
			T2[1] = T2[0] + Math.min(T1[0], A) - Math.min(T2[0], B);
			T3[1] = T3[0] + Math.min(T2[0], B) - Math.min(T3[0], C);
			T4[1] = T4[0] + Math.min(T3[0], C) - Math.min(T4[0], D);
			T5[1] = T5[0] + Math.min(T4[0], D) - Math.min(T5[0], E);
			T6[1] = T6[0] + Math.min(T5[0], E);
			
			T1[0] = T1[1];
			T2[0] = T2[1];
			T3[0] = T3[1];
			T4[0] = T4[1];
			T5[0] = T5[1];
			T6[0] = T6[1];
			
			count++;
		} while(!(T1[1] == 0 && T2[1] == 0 && T3[1] == 0 && T4[1] == 0 && T5[1] == 0 && T6[1] != 0));
		
		System.out.println(count);
		
	}
}
