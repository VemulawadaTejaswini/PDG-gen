import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		for(int j = 0; j < N - 1; j++){
			if (A[j] == A[j+1]){
				count = 1;
			}
		}
		
		if(count == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
