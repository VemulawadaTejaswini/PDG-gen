import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }

        long result = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                result += A[i]*A[j];
            }
        }
        System.out.println(result % 1000000007);
    }
    
}
