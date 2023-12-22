import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		boolean prime[] = new boolean[300000];
		int sum[] = new int[300000];
		
		prime[0] = true;
		prime[1] = true;
		
		sum[0] = 0;
		for(int i =1 ; i < prime.length; i++){
			if(prime[i]){
				sum[i] = sum[i-1];
				continue;
			}
			sum[i] = sum[i-1]+1;
			for(int j = i*2; j < prime.length ; j+=i){
				prime[j] = true;
			}
		}
		
		for(;;){
			int n = sc.nextInt();
			if(n == 0 ){
				break;
			}
			System.out.println(sum[2*n]- sum[n]);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}