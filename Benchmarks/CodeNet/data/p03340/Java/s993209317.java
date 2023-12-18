import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] A = new int[N+1];
		int[] sum = new int[N+1];
		int[] xor = new int[N+1];
		for(int i = 1; i < N; i++){
			A[i] = in.nextInt();
			sum[i] = sum[i-1] + A[i];
			xor[i] = xor[i-1] ^ A[i];
		}
		
		long ans = 0;
		for(int L = 1; L <= N; L++){
			for(int R = L; R <= N; R++){
				int s = sum[R] - sum[L-1];
				int x = xor[R] ^ xor[L-1];
				if(s == x) ans++;
			}
		}
		
		System.out.println(ans);
	}
}