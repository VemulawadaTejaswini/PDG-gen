import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(bf.readLine());
		
		int[] cards = new int[N+1];
		
		for(int i = 1 ; i <= N ; i++){
			cards[i] = Integer.parseInt(bf.readLine());
		}
		
		long sum = 0;
		int prev = 0;
		
		for(int i = 1 ; i <= N ; i++){
			if(prev == 0){
				sum += (cards[i]/2);
				if(cards[i]%2 != 0){
					prev = 1;
				}
				else prev = 0;
			}
			else{
				if(cards[i] == 0) prev = 0;
				else{
					cards[i]++;
					sum += (cards[i]/2);
					if(cards[i]%2 != 0){
						prev = 1;
					}
					else prev = 0;
				}
			}
		}
		
		System.out.println(sum);
		
	}
}
