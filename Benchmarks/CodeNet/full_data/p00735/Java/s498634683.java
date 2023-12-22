import java.util.*;

public class Main {
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		int MAX = 3000000;
		boolean [] isprime = new boolean[MAX + 1];
		for(int i = 6; i <= MAX;i+= 7){
			isprime[i] = true;
		}
		for(int i = 8; i<= MAX; i+= 7){
			isprime[i] = true;
		}
		for(int i = 6; i * i <= MAX ; i+=7){
			if(isprime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					isprime[j] = false;
				}
			}
			if((i + 2) <= MAX && isprime[i+2]){
				for(int j = (i+2) * 2; j <= MAX; j+= (i+2)){
					isprime[j] = false;
				}
			}
		}
		while(true){
			int n = sc.nextInt();
			if(n == 1){
				break;
			}
			System.out.print(n+":" );
			for(int i = 6; i <= n; i+=7){
				if(isprime[i] && n % i == 0){
					System.out.print(" " +i);
				}
				if((i + 2) <= n && isprime[i+2] && n % (i+2) == 0){
					System.out.print(" " +(i+2));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}