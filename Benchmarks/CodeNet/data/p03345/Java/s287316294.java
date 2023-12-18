import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long An,Bn,Cn;
		boolean ch = true;
		for (long i=0; i<K; i++) {
			An = B + C;
			Bn = C + A;
			Cn = A + B;

			A = An;
			B = Bn;
			C = Cn;

			if (A-B > Math.pow(10,18)) {
				System.out.println("Unfair");
				ch = false;
				break;
			}
		}

		if(ch){
			System.out.println(A-B);
		}
	}
}
