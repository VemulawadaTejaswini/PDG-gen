import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	final static int SIZE = 1501;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		BigInteger[] fact = new BigInteger[SIZE + 1];
		
		for(int i = 0; i <= SIZE; i++){
			if(i == 0){
				fact[i] = new BigInteger(1 + "");
			}else{
				fact[i] = fact[i-1].multiply(new BigInteger(i + ""));
			}
		}
		
		final int n = sc.nextInt();
		
		final BigInteger ans = fact[n+1].add(new BigInteger("2"));
		System.out.println(ans);
		
		for(int i = 0; i < n; i++){
			System.out.println(i + 2);
		}
		
	}

}