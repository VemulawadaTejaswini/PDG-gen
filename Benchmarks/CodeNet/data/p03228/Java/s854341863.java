package demo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int K = in.nextInt();
		boolean a = true;
		while (K-- > 1) {
			if (a) {
				if (A % 3 == 0) {
					A--;
					if (A % 2 == 0) {
						B += A / 2;
						A /= 2;
					}
				} else if (A % 2 == 0) {
					B += A / 2;
					A /= 2;
				}
				a = false;
			} else {
				if (B % 3 == 0) {
					B--;
					if (B % 2 == 0) {
						A += B / 2;
						B /= 2;
					}
				} else if (B % 2 == 0) {
					A += B / 2;
					B /= 2;
				}
				a = true;
			}
		}
		
		System.out.println(A + " " + B);
	}
	
}
