import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int calc(int n, int ten, int fifty, int hund, int fihund){
		int rest = (ten * 10 + fifty * 50 + hund * 100 + fihund * 500) - n;
		
		int[] size = {500, 100, 50, 10};
		int[] ret = new int[4];
		for(int i = 0; i < 4; i++){
			int div = rest / size[i];
			ret[i] = div;
			rest -= div * size[i];
		}
		
		int sum = 0;
		for(int num : ret){
			sum += num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			if(!first){
				System.out.println();
			}else{
				first = false;
			}
			
			final int ten = sc.nextInt();
			final int fifty = sc.nextInt();
			final int hund = sc.nextInt();
			final int fihund = sc.nextInt();
			
			int min = Integer.MAX_VALUE;
			int[] min_count = new int[4];
			for(int i = 0; i <= fihund; i++){
				if(n <= 500 * i){
					int sum = calc(n, 0, 0, 0, i);
					
					if(min > sum){
						min = sum;
						min_count[0] = i;
						min_count[1] = 0;
						min_count[2] = 0;
						min_count[3] = 0;
					}
				}
				
				for(int j = 0; j <= hund; j++){
					if(n <= 500 * i + 100 * j){
						int sum = calc(n, 0, 0, j, i);
						
						if(min > sum){
							min = sum;
							min_count[0] = i;
							min_count[1] = j;
							min_count[2] = 0;
							min_count[3] = 0;
						}
					}
					
					for(int k = 0; k <= fifty; k++){
						if(n <= 500 * i + 100 * j + 50 * k){
							int sum = calc(n, 0, k, j, i);
							
							if(min > sum){
								min = sum;
								min_count[0] = i;
								min_count[1] = j;
								min_count[2] = k;
								min_count[3] = 0;
							}
						}
						
						for(int l = 0; l <= ten; l++){
							if(n <= 500 * i + 100 * j + 50 * k + 10 * l){
								int sum = calc(n, l, k, j, i);
								
								if(min > sum){
									min = sum;
									min_count[0] = i;
									min_count[1] = j;
									min_count[2] = k;
									min_count[3] = l;
								}
							}
						}
					}
				}
			}
			
			int[] size = new int[]{500, 100, 50, 10};
			for(int i = 3; i >= 0; i--){
				if(min_count[i] > 0){
					System.out.println(size[i] + " " + min_count[i]);
				}
			}
		}
	}

}