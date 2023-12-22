import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {

			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int ans = 0;
			
			for(int i = 1; i <= 54; i++){
				if(i*i*i <= N){
					ans = Math.max(ans, i*i*i);
					
					for (int j = 1; j <= 96; j++) {
						if ((j * (j + 1) * (j + 2)) / 6 <= N) {
							ans = Math.max(ans, (j * (j + 1) * (j + 2)) / 6);
							
							if((i*i*i) + ((j * (j + 1) * (j + 2)) / 6) <= N){
								ans = Math.max(ans, (i*i*i) + ((j * (j + 1) * (j + 2)) / 6));
							}
						}
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}