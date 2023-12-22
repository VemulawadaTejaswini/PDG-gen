import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[] own = new int[N];
			int[] ene = new int[N];
			
			for(int i = 0; i < N; i++){
				own[i] = -sc.nextInt();
			}
			Arrays.sort(own);
			for(int i = 0; i < N; i++){
				own[i] = -own[i];
			}
			
			for(int i = 0; i < N; i++){
				ene[i] = -sc.nextInt();
			}
			Arrays.sort(ene);
			for(int i = 0; i < N; i++){
				ene[i] = -ene[i];
			}
			
			int[] sum = new int[N];
			for(int i = 0; i < N; i++){
				sum[i] = own[i] > ene[i] ? 1 : 0;
			}
			for(int i = 1; i < N; i++){
				sum[i] += sum[i - 1];
			}
			
			boolean flag = false;
			for(int K = 1; K < N; K++){
				final int must = K / 2 + 1;
				
				if(sum[K - 1] >= must){
					flag = true;
					System.out.println(K);
					break;
				}
			}
			
			if(!flag){
				System.out.println("NA");
			}
			
		}
		
		sc.close();
	}
}