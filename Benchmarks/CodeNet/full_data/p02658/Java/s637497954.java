import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long A[] = new long[N];
		long answer = 1;
		for(int i = 0; i < N; ++i){
		    A[i] = sc.nextLong();
		}
		
		for(int i = 0; i < N; ++i){
		    if(A[i] < ((long)Math.pow(10,18)/answer)){
		        answer *= A[i];
		    }else{
		        answer = -1;
		    }
		}
		System.out.println(answer);
	}
}