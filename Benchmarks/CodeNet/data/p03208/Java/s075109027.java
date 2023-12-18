import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] vis = new boolean[60];

    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	long[] trees = new long[N];
    	for(int i = 0; i < N; i++){
    		trees[i] = sc. nextLong();
    	}
    	Arrays.sort(trees);
    	sc.close();
    	long min = trees[N-1];
    	for(int i = 0; i < N - (K - 1); i++){
    		min = Math.min(min, (trees[i + (K - 1)] - trees[i]));
    	}
    	System.out.println(min);
    }
}