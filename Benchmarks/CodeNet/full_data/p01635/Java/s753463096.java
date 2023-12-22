import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] fst = sc.nextLine().split(" ");
		BigInteger n = new BigInteger(fst[0] + "");
		BigInteger T = new BigInteger(fst[1] + "");
		
		BigInteger MAX = new BigInteger("1000000000");
		
		String input = sc.nextLine();
		
		BigInteger sum = new BigInteger("0");
		for(String in : input.split("\\+")){
			//System.out.println(in);
			
			int num = Integer.parseInt(in.split("\\^")[1]);
			sum = sum.add(n.pow(num).multiply(T));
			
		}
		
		System.out.println(sum.compareTo(MAX) <= 0 ? (sum + "") : "TLE");
	}

}