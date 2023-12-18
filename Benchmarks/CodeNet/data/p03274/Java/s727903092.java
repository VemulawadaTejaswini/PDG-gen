import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int indexStart;
		int indexEnd;
		
		for(int i = 0; i < N; i++){
			x[i] = sc.nextInt();
		}
		
		indexStart = 0;
		for(int i = 0; i < N; i++){
			if(x[i + K - 1] > 0) break;
			indexStart = i;
		}
		
		indexEnd = N-K;
		for(int i = 0; i < 0; i++){
			if(x[N-K-i] < 0) break;
			indexEnd = N-K-i;
		}
		
		long ans = 100000001;
		for(int i = indexStart; i <= indexEnd; i++){
			long sumCostL = 0;
			long sumCostR = 0;
			
			if(x[i] < 0) sumCostL = -x[i];
			if(x[i+K-1] > 0) sumCostR = x[i+K-1];
			
			/*
			System.out.println(":i = " + i);
			System.out.println("R = " + sumCostR);
			System.out.println("L = " + sumCostL);
			System.out.println("RRL = " + (2 * sumCostR + sumCostL));
			System.out.println("LLR = " + (2 * sumCostL + sumCostR));
			*/
			
			if(i == indexStart){
				if(sumCostL == 0) ans = sumCostR;
				if(sumCostR == 0) ans = sumCostL;
				else ans = 2 * sumCostR + sumCostL;
			}
			
			if(sumCostL == 0 && sumCostR < ans) ans = sumCostR;
			if(sumCostR == 0 && sumCostL < ans) ans = sumCostL;
			if(sumCostR <= sumCostL && 2 * sumCostR + sumCostL < ans) ans = 2 * sumCostR + sumCostL;
			if(sumCostL <= sumCostR && 2 * sumCostL + sumCostR < ans) ans = 2 * sumCostL + sumCostR;
		}
		
		//System.out.println(indexStart + " " + indexEnd);
		System.out.println(ans);
	}
}