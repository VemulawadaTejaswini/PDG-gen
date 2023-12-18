import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			
			final int K = sc.nextInt();
			final int T = sc.nextInt();
			
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
			for(int i = 0; i < T; i++){
				queue.add(sc.nextInt());
			}
			
			if(T == 1){
				System.out.println(Math.max(0, queue.poll() - 1));
			}else{
				while(queue.size() > 1){
					final int fst = queue.poll();
					final int snd = queue.poll();
					
					if(fst != 1){ queue.add(fst - 1); }
					if(snd != 1){ queue.add(snd - 1); }
				}
				
				System.out.println(Math.max(0, queue.poll() - 1));
			}
		}
	}
}