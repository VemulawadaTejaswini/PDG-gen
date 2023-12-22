import java.util.*;
public class Main {
	final int MAX = (1 << 15);
	private void doit(){
		Scanner sc = new Scanner(System.in);
		boolean [] isprime = new boolean[MAX + 1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for(int i = 0; i * i <= MAX; i++){
			if(isprime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					isprime[j] = false;
				}
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int count = 0;
			for(int i = 2; i <= n / 2; i++){
				if(isprime[i] && isprime[n - i]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}