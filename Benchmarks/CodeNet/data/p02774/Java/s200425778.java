import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		BigInteger[] line = new BigInteger[N];
		
		for(int i = 0; i < N; i++) {
			line[i] = sc.nextBigInteger();
		}
		
		ArrayList<BigInteger> list = map(N,line);
		System.out.println(list.get(K-1));
	}
	
	public static ArrayList<BigInteger> map(int N, BigInteger[] line) {
		ArrayList<BigInteger> list = new ArrayList<>();
		Map<Integer,BigInteger> linem = new HashMap<>();
		for(int i = 0; i < N; i++) {
			linem.put(i, line[i]);
		}
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				list.add((linem.get(i)).multiply(linem.get(j)));
			}
		}
		Collections.sort(list);
		return list;
	}
}