import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int play(char[] seq, boolean first){
		int left = 0, right = 0;
		int count = 0;
		
		if(first){
			left = seq[0] - '0';
		}else{
			right = seq[0] - '0';
		}
		
		first = !first;
		
		for(int i = 1; i < seq.length; i++){
			int next = seq[i] - '0';
			
			if(first){
				final int l_mod = (left - 1) % 3;
				final int n_mod = (next - 1) % 3; //new_right
				
				if(l_mod <= n_mod){
					right = next;
					first = !first;
				}else{
					right = left;
					left = next;
					count++;
				}
			}else{
				final int r_mod = (right - 1) % 3;
				final int n_mod = (next  - 1) % 3; //new left
				
				if(n_mod <= r_mod){
					left = next;
					first = !first;
				}else{
					left = right;
					right = next;
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			String in = sc.next();
			
			if("#".equals(in)){
				break;
			}
			
			char[] input = in.toCharArray();
			
			System.out.println(Math.min(play(input, true), play(input, false)));
			
		}
		
		
	}

}