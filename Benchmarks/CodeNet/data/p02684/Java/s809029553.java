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
        int former = 1;
        int[] loop = new int[N + 1];
        int count = 1;
        loop[count] = A[count]; 
        for(long j = 1; j < N + 1; j++) {
        	current = A [A[current]];
        	count ++;
        	loop[count] = current;
        	if(current == A[1]) {
        		break;
        	}
        }
        long l = K % (long)loop.length;
        int i = (int)l;
        System.out.println(loop[i]);
    }
}