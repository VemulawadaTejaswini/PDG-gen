import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] A = new Long[N];
		for(int i = 0; i < N; i ++){
			A[i] = sc.nextLong();
		}
		Long sum = 1L;
		for(int i = 0; i < N; i ++){
			sum *= A[i];
		}
		if(sum > 1000000000000000000L){
		System.out.println(-1);
		}else{
			System.out.println(sum);
		}
		
	}
}