import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
		}
		
		if(N == 0){
			System.out.println(0);
		}
		if(N == 1 || N == 2){
			System.out.println(1);
		}
		
		int flag = A[0] < A[1] ? 1 : -1;
		int count = 0;
		
		for(int i = 1; i < N - 1; i++){
			int tempFlag = A[i] < A[i + 1] ? 1 : -1;
			if(flag != tempFlag){
				count ++;
				i++;
				if(i < N - 1){
					flag = A[i] < A[i + 1] ? 1 : -1;
				}
			}
		}
		
		count ++;
		System.out.println(count);
		sc.close();
	}
}
