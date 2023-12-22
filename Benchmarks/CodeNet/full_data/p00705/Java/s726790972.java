
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			final int Q = sc.nextInt();
			
			if(N == 0 || Q == 0){
				break;
			}
			
			ArrayList<ArrayList<Integer>> members = new ArrayList<ArrayList<Integer>>();
			HashSet<Integer> set = new HashSet<Integer>();
			
			for(int i = 0; i < N; i++){
				final int M = sc.nextInt();
				final ArrayList<Integer> list = new ArrayList<Integer>(); 
				
				for(int j = 0; j < M; j++){
					final int date = sc.nextInt();
					
					list.add(date);
					set.add(date);
				}
				
				members.add(list);
			}
			
			boolean flag = false;
			int max = Q - 1;
			int max_date = 0;
			for(final int i : set){
				int count = 0;
				
				for(int j = 0; j < N; j++){
					if(members.get(j).contains(i)){
						count++;
					}
				}
				
				if(count > max){
					max = count;
					max_date = i;
				}
			}
			
			System.out.println(max_date);
		}
		
	}

}