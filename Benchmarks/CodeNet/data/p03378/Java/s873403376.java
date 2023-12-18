import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int X = sc.nextInt();
    	int[] map = new int[N+1];
    	for (int i = 0; i < M; i++) {
    		map[sc.nextInt()] = 1;
    	}
    	int cost1 = 0;
    	int cost2 = 0;
    	for (int i = X+1; i < N; i++) {
    		cost1 += map[i];
    	}
    	for (int i = X-1; 0 < i; i--) {
    		cost2 += map[i];
    	}
    	System.out.println(Math.min(cost1, cost2));
    }
}