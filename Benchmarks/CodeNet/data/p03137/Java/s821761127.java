import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (M <= N) {
		    System.out.println("0");
		    return;
		}
		
		int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        
        int[] diff = new int[M-1];
        for (int i = 0; i < M - 1; i++) {
            diff[i] = X[i+1] - X[i];
        }
        Arrays.sort(diff);
        
        int diffSum = 0;
        for (int i = 0; i < N - 1; i++) {
            diffSum += diff[M - 2 - i];
        }
        
        System.out.println(X[M-1] - X[0] - diffSum);
	}
}