import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=0; i<N; i++){
        	A[i] = sc.nextInt();
        }
        A[N] = 0;
        int current;
        int next;
        int total;
        for(int i=0; i<N; i++){
        	total = 0;
        	current = 0;
        	for(int j=0; j<A.length; j++){
        		if(i != j){
        			next = A[j];
        			total += Math.abs(current-next);
        			current = next;
        		}
        	}
        	System.out.println(total);
        }
        
	}

}
