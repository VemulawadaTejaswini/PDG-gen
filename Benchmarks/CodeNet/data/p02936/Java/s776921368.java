import java.util.*;
public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int a[] = new int[N];
		for(int i = 1; i < N; i++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			a[a2-1] = a1-1;
		}
		int sum[] = new int[N];
		for(int i = 0; i < Q; i++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			sum[a1-1] += a2;
		}
		
		for(int i = 1; i < N; i++){			
			sum[i] += sum[a[i]];
		}
		
		for(int i = 0; i < N; i++){
			System.out.print(sum[i]);
			if(i != N -1)System.out.print(" ");
		}
		
	}
	
}
