import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int p = sc.nextInt();
		int q = sc.nextInt();
		calc(p, q);
	}
	public void calc(int p, int q){
		int a = q;
		int b = p;
		int max = 0;
		while(true){
			int c = a % b;
			if(c == 0){
				max = b;
				break;
			}
			else{
				a = b;
				b = c;
			}
		}
		q = q / max;
		int ans = -1;
		
		char[] memo = new char[100000];
		for(int i = 2; i < Math.min(q, 100000); i++){
			if(memo[i] == 0){
				long k = i;
				while(true){
					if(k > q || k >= 100000) break;
					else if(k == q) {
						ans = i;
						break;
					}
					else{
						memo[(int)k] = 1;
						k = k * i;
					}
				}
			}
			
			if(ans != -1) break;
		}
		if(ans == -1) ans = q; 
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}