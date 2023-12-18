import java.util.Scanner;

public class Main {
	static long gcd(long a,long b){ return b==(long)0 ? gcd(b,a%b) : a; }
	static long lcm(long a,long b){ return a/ gcd(a,  b) * b; }
		
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		long B = scn.nextLong();
		long C = scn.nextLong();
		long D = scn.nextLong();
		long ans = B - A + 1;
		long ansC = 0, ansD = 0, ansCD = 0;
		long CD = lcm(C,D);
		if (A == B) {
			System.out.println((A % C == 0) || (A % D == 0) ? 0 : 1);
		} else {
			if (C == D) {
				if (C <= B) {
					if (A % C == 0) {
						ansC = (B - A) / C + 1;
					} else {
						ansC = (B - (A + (C - A % C))) / C + 1;
					}
				}
			} else {
				if (C <= B) {
					if (A % C == 0) {
						ansC = (B - A) / C + 1;
					} else {
						ansC = (B - (A + (C - A % C))) / C + 1;
					}
				}
				if (D <= B) {
					if (A % D == 0) {
						ansD = (B - A) / D + 1;
					} else {
						ansD = (B - (A + (D - A % D))) / D + 1;
					}
				}
				if (CD <= B) {
					if (A % (CD) == 0) {
						ansCD = (B - A) / (CD) + 1;
					} else {
						ansCD = (B - (A + ((CD) - A % (CD)))) / (CD) + 1;
					}
				}
			}
			System.out.println(ans + ansCD - ansC - ansD);
		}
	}
}
