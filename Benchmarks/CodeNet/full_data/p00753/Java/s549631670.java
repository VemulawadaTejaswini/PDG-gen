import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		final int MAX = 123456 * 2;
		boolean [] isprime = new boolean[MAX+1];
		for(int i = 2; i <= MAX; i++){
			isprime[i] = true;
		}
		for(int i = 2; i * i <= MAX; i++){
			if(isprime[i]){
				for(int j = i + i; j <= MAX; j += i){
					isprime[j] =false;
				}
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int count = 0;
			for(int i = n+1; i <= 2 * n; i++){
				if(isprime[i]) count++;
			}
			System.out.println(count);
		}
			
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}