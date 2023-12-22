import java.util.*;
import java.io.*;
import java.lang.*;


class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
		int sum = 0;
		int[] ar = new int[n];
		for(int i = 0 ; i < n ; i++){
			ar[i] = in.nextInt();
			sum += ar[i];
		}
		
		Arrays.sort(ar);
		int q = in.nextInt();
		for(int i = 0 ; i < q ; i++){
			int b = in.nextInt();
			int c = in.nextInt();

			int change = c - b;
			for(int j = 0 ; i < n ; i++){
				if(ar[j] == b){
					for(int k = j ; ; j++){
						if(ar[k] != b)
							break;

						sum += change;
					}
					break;
				}
				System.out.println(sum);
			}
		}
    }
 
}