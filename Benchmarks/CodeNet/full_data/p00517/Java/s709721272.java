
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		final int w = sc.nextInt();
		final int h = sc.nextInt();
		final int n = sc.nextInt();
		
		int[] xs = new int[n];
		int[] ys = new int[n];
		for(int i = 0; i < n; i++){
			xs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
		}
		
		int cost = 0;
		for(int i = 1; i < n; i++){
			final int dx = xs[i] - xs[i-1];
			final int dy = ys[i] - ys[i-1];
		
			if(dx * dy >= 0){
				final int common = Math.min(Math.abs(dx), Math.abs(dy));
				cost += (common + (Math.abs(dx) - common) + (Math.abs(dy) - common));
			}else{
				cost += (Math.abs(dx) + Math.abs(dy));
			}
		}
		System.out.println(cost);
	}
}