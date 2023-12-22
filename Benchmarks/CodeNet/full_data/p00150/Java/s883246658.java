import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	boolean prime[] = new boolean[10001];
	int ans[] = new int[10001];
	void run(){
		Arrays.fill(prime,true);
		
		prime[0] = false;
		prime[1] = false;
		
		int value = 0;
		for(int i =0 ; i < 10001 ; i++){
			if(prime[i]){
				for(int j = i+i;j < 10001; j+=i){
					prime[j] = false;
				}
				if(prime[i-2]){
					value = i;
				}
			}
			ans[i] = value;
		}
		
		
		for(;;){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			System.out.println((ans[n]-2)+" "+ ans[n]);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}