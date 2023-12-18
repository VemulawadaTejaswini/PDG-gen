import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = new int[] {Integer.parseInt(sc.next()),Integer.parseInt(sc.next())}; 
		int[] second = new int[first[1]];
		for(int i=0; i<first[1]; i++) {
			second[i] = Integer.parseInt(sc.next());
		}
//		int[] first = new int[] {100,5};
//		int[] second = new int[] {1,23,45,67,89};

		
		boolean check = true;
		for(int i=0; i<first[1]-1; i++) {
			try {
				if(second[i] == second[i+1]-1) {
					check = false;
					break;
				}
			}catch (Exception e) {
				check = false;
				break;
			}
		}
		if(check == false) {
			System.out.println(0);
			return;
		}
		
		int firstStep = 0;
		int lastStep = second[0]-1;
		BigInteger[] bArray = new BigInteger[second.length+1];
		BigInteger fibonacchi = new BigInteger("1");
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		
		for(int i=0; i<=second.length; i++) {
			a = new BigInteger("0");
			b = new BigInteger("1");
			for(int j=firstStep+1; j<=lastStep; j++) {
//				System.out.println("tets"+j);
//				System.out.println("tet"+lastStep);
				fibonacchi = fibonacchi(a, b);
				a = b;
				b = fibonacchi;
			}
			bArray[i] = fibonacchi;
			try {
				firstStep = second[i]+1;
				lastStep = second[i+1]-1;
			}catch (Exception e) {
				firstStep = second[second.length-1]+1;
				lastStep = first[0];
			}
		}
		BigInteger result = new BigInteger("1");
		for(BigInteger bi:bArray) {
			result = result.multiply(bi);
		}
//		long result = 1;
//		for(int i=0; i<list.size(); i++) {
////			System.out.println(result);
//			result *= list.get(i).get(list.get(i).size()-1);
//		}
//		System.out.println(result);
		System.out.println(result.mod(new BigInteger("1000000007")));
	}
	public static BigInteger fibonacchi(BigInteger b1,BigInteger b2) {
//		System.out.println(b1.add(b2));
		return b1.add(b2);
	}
}