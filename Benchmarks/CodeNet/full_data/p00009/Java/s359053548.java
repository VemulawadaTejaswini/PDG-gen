import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			int primeCount = 0;
			boolean isPrime;

			while(n > 1){
				isPrime = true;
				for(int i = 2;i <= n - 1; i++){
					if(n % i == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeCount++;
				}
				n--;
			}
			System.out.println(primeCount);
		}
	}
}