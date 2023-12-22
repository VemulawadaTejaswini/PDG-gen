import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int M = s.nextInt();
	int K = s.nextInt();
	int[] A = new int[N];
	int[] B = new int[M];
	for(int i = 0; i < N; i++){
		A[i] = s.nextInt();
	}
	for(int i = 0; i < M; i++){
		B[i] = s.nextInt();
	}
	long count = 0;
	long countSum = 0;
	int x = 0;
	int y = 0;
	while(true){
		if(x == N && y == M) break;
		if(x == N){
			countSum += B[y];
			y++;
		}else if(y == M){
			countSum += A[x];
			x++;
		}else{
			if(A[x] > B[y]){
				countSum += B[y];
				y++;
			}else{
				countSum += A[x];
				x++;
			}
		}
		if(countSum > K) break;
		count++;
	}
	System.out.println(count);
    
  }
}