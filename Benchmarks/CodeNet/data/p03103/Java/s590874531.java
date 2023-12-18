import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	long[][] A = new long[N][2];
    	for(int i = 0; i < N; i++){
    		A[i][0] = sc.nextLong();
    		A[i][1] = sc.nextLong();
    	}
    	sc.close();
    	Arrays.sort(A, (s, t) -> Long.compare(s[0],t[0]));
    	long ans = 0;
    	int sum = 0;
    	for(int i = 0; i < N; i++){
    		if(sum + A[i][1] <= M){
    			ans += A[i][0] * A[i][1];
    			sum += A[i][1];
    		}else if(sum < M){
    			ans += (M - sum) * A[i][0];
    			sum += M - sum;
    		}
    	}
    	System.out.println(ans);
    }
}