import java.util.Arrays; 
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] can = new boolean[1000001];
		
		while(true){
			final int n = sc.nextInt();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			if(n == 0 && a == 0 && b == 0){
				break;
			}
			
			for(int i = 0; i <= n; i++){
				can[i] = false;
			}
			
			can[a] = true;
			can[b] = true;
			
			int count = 0;
			
			if(a <= n && b <= n){
				if(a == b){
					count++;
				}else{
					count+=2;
				}
			}
			
			for(int i = 0; i <= (n - a); i++){
				//System.out.println(i + " " + count);
				
				if(can[i] == true && can[i + a] == false){
					can[i + a] = true;
					count++;
				}
			}
			
			for(int i = 0; i <= (n - b); i++){
				//System.out.println(i + " " + count);
				
				if(can[i] == true && can[i + b] == false){
					can[i + b] = true;
					count++;
				}
			}
			
			System.out.println(n - count);
		}
		
	}
}