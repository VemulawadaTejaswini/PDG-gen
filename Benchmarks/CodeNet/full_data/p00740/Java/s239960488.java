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

			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] stone = new int[n];
			int in = m;
			int cur = 0;
			
			while(true){
				if(in == 0){
					if(stone[cur] == m){
						System.out.println(cur);
						break;
					}else{
						in = stone[cur];
						stone[cur] = 0;
					}
				}else{
					stone[cur]++;
					in--;
				}
				cur = (cur + 1) % n;
			}
			
			
		}
	}

}