import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);

		final int M = sc.nextInt();
		final int N = sc.nextInt();
		
		int max = 0;
		for(int i = 0; i < M; i++){
			int count = 0;
			
			for(int j = 0; j < N; j++){
				if(sc.nextInt() == 1){
					count++;
				}
			}
			
			max = Math.max(count, max);
		}
		
		System.out.println(max);
	}

}