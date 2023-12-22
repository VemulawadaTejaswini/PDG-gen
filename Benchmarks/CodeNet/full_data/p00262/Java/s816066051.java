import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> sankaku = new ArrayList<Integer>();
		{
			int k = 1;
			while(true){
				int cur = k * (k + 1) / 2;
				
				if(cur > 1000000){
					break;
				}
				
				sankaku.add(cur);
				k++;
			}
		}
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			int sum_s = 0;
			
			for(int i = 0;i < N; i++){
				final int in = sc.nextInt();
				list.add(in);
				sum_s += in;
			}
			
			if(Collections.binarySearch(sankaku, sum_s) < 0){
				System.out.println(-1);
				continue;
			}
			
			int count = 0;
			while(true){
				int pur = 1;
				
				if(count > 10000){
					break;
				}
				
				boolean flag = false;
				for(int i : list){
					if(pur != i){
						flag = true;
						break;
					}
					
					pur++;
				}
				
				if(!flag){
					break;
				}
				
				//System.out.println(list);
				
				int sum = 0;
				for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext(); ){
					int cur = iter.next();
					
					if(cur >= 1){
						sum++;
						if(cur > 1){
							iter.set(cur - 1);
						}else{
							iter.remove();
						}
					}else{
						iter.remove();
					}
				}
				
				list.add(sum);
				count++;
			}
			
			if(count > 10000){
				System.out.println(-1);
			}else{
				System.out.println(count);
			}
		}
	}

}