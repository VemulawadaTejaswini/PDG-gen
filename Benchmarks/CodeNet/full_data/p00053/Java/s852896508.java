
import java.util.*;
public class Main {

	//f©Ç¤©ð»Ê·éÖ
	private boolean isPrime(int n){
		for(int i=2; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//GgXelXÌÓé¢
		final int MAX = 999999;
		boolean [] prime = new boolean[MAX + 1];
		for(int i=2; i < prime.length; i++){
			prime[i] = true;
		}
		for(int i=2; i * i < MAX; i++){
			if(isPrime(i)){
				for(int j = i + i; j <= MAX; j += i){
					prime[j] = false;
				}
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			int count = 1;
			for(int i=0; count <= n; i++){
				if(prime[i]){
					sum += i;
					count++;
				}
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}