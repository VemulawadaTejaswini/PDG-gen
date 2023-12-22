import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long A = new int[N];
		
		for(int i; i < N; ++i){
		    A[i] = sc.nextLong();
		}
		for(int i; i < N-1; ++i){
		    int num = A[i]*A[i+1];
		    int ans += num;
		}
		if(ans =< 10^18){
		    System.out.println(ans);
		}
		System.out.println(-1);