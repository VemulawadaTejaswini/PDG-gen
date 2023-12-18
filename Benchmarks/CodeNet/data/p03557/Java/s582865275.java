import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = in.nextInt();
		Arrays.sort(A);
		int[] B = new int[N];
		for(int i = 0; i < N; i++) B[i] = in.nextInt();
		Arrays.sort(B);
		int[] C = new int[N];
		for(int i = 0; i < N; i++) C[i] = in.nextInt();
		Arrays.sort(C);
		
		int[] ab = new int[N];
		int[] bc = new int[N];
		
		int index = 0;
		for(int i = 0; i < N; i++){
			//System.out.println(i + " " + index);
			if(index >= N || A[index] >= B[i]){
				if(i != N - 1) ab[i+1] = ab[i];
				continue;
			}
			
			int indexStart = index;
			while(index <= N - 1 && A[index] < B[i]) index++;
			ab[i] += index - indexStart;
			
			if(i != N - 1) ab[i+1] = ab[i];
		}
		
		/*
		for(int aabb : ab) System.out.print(aabb + " ");
		System.out.println();
		*/
		
		index = 0;
		for(int i = 0; i < N; i++){
			//System.out.println(i + " " + index);
			if(index >= N || B[index] >= C[i]){
				if(i != N - 1) bc[i+1] = bc[i];
				continue;
			}
			
			while(index <= N - 1 && B[index] < C[i]){
				bc[i] += ab[index];
				index++;
			}
			
			if(i != N - 1) bc[i+1] = bc[i];
		}
		
		/*
		for(int bbcc : bc) System.out.print(bbcc + " ");
		System.out.println();
		*/
		
		int ans = 0;
		for(int bbcc : bc) ans += bbcc;
		System.out.println(ans);
	}
}
