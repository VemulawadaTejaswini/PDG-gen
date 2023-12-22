import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[] points = new int[N];
		
		for(int i = 0; i < ((N*(N-1))/2); i++){
			final int A = sc.nextInt() - 1;
			final int B = sc.nextInt() - 1;
			final int C = sc.nextInt();
			final int D = sc.nextInt();
			
			if(C > D){
				points[A] += 3;
			}else if(C < D){
				points[B] += 3;
			}else{
				points[A] += 1;
				points[B] += 1;
			}
		}
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i : points){
			tree.add(i);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(tree);
		
		
		int[] dup = new int[list.size()];
		for(int i = 0; i < N; i++){
			dup[Collections.binarySearch(list, points[i])]++;
		}
		
		for(int i = 0; i < dup.length; i++){
			dup[i]--;
		}
		//System.out.println(Arrays.toString(dup));
		for(int i = dup.length - 1; i > 0; i--){
			dup[i-1] += dup[i];
		}
		
		dup[dup.length - 1] = 0;
		for(int i = 0; i < dup.length - 1 ; i++){
			dup[i] = dup[i+1];
		}
		
		//System.out.println(Arrays.toString(dup));
		
		for(int i = 0; i < N; i++){
			System.out.println((list.size() - Collections.binarySearch(list, points[i])) + dup[Collections.binarySearch(list, points[i])]);
		}
	}

}