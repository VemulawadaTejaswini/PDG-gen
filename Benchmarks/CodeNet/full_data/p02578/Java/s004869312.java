import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int top = 0;
        int result = 0;

        for (int i=0; i<N; i++) {
            if (A[i] > top) {
                top = A[i];
            } else if ((A[i] < top)) {
                result += (top-A[i]);
            }
        }
        
        System.out.println(result);
    }
}
