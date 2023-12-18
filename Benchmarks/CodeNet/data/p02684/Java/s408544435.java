import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        Integer N = s.nextInt();
        Long K = Long.parseLong(s.next());
        int[] A = new int[N+1];
        for(int i = 1; i <= N; i++) {
        	A[i] = s.nextInt();
        }
        
        int current = 1;
        for(long j = 1; j < K; j++) {
        	current = A [A[current]];
        }
        System.out.println(current);
    }
}