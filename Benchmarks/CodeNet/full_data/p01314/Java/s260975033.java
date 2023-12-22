import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[] array = new int[N];
			
			for(int i = 0; i < N; i++){
				array[i] = i + 1;
			}
			
			int count = 0;
			for(int i = 2; i < N; i++){
				int sum = 0;
				for(int j = 0; j < i; j++){
					sum += array[j];
				}
				
				for(int j = i; j < N; j++){
					if(sum >= N){
						if(sum == N){
							count++;
						}
						break;
					}
					
					sum -= array[j];
					sum += array[j + i];
				}
			}
			
			System.out.println(count);
		}
		
	}

}