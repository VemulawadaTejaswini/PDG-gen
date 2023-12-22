import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			char[] input = sc.next().toCharArray();
			//System.out.println(input);
			
			int[][] ops = new int[N][2];
			
			for(int i = 0; i < N; i++){
				final int start = sc.nextInt() - 1;
				final int end = sc.nextInt() - 1;
				ops[i][0] = start;
				ops[i][1] = end;
			}
			
			for(int i = N - 1; i >= 0; i--){
				final int start = ops[i][0];
				final int end = ops[i][1];
				
				int sub = Math.abs(start - end);
				
				//System.out.println(input[start] + " " + input[end]);
				
				input[start] = (char) (input[start] + sub > 'z' ? input[start] - 26 + sub : input[start] + sub);
				input[end] = (char) (input[end] + sub > 'z' ? input[end] - 26 + sub : input[end] + sub);
				
				//System.out.println(input[start] + " " + input[end] + " " + sub);
				
				char tmp = input[start];
				input[start] = input[end];
				input[end] = tmp;
				
				//System.out.println(input[start] + " " + input[end]);
			}
			
			System.out.println(input);
		}
		
	}

}