import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static LinkedList<Integer> dps(int num, int selected, int[] weight){
		if(num > 10){
			return null;
		}else if(num == 10){
			return new LinkedList<Integer>();
		}
		
		for(int i = selected; i >= 0; i--){
			if(weight[i] == 0){
				continue;
			}
			
			weight[i]--;
			LinkedList<Integer> tmp = dps(num + i, i, weight);
			weight[i]++;
			
			if(tmp != null){
				tmp.add(i);
				return tmp;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] weights = new int[11];
			
			for(int i = 0; i < n; i++){
				weights[sc.nextInt()]++;
			}
			
			int count = 0;
			
			while(true){
				LinkedList<Integer> ret = dps(0, 10, weights);
				
				if(ret == null){
					break;
				}else{
					count++;
					
					for(int i : ret){
						weights[i]--;
					}
				}
			}
			
			System.out.println(count);
			
		}
	}

}