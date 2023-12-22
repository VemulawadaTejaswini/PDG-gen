import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		while(true){
			Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();
			int primeCount = 0;

			while(n > 0){
				if(n == 2 | n == 3){
					primeCount++;
				}else if(n % 2 == 0){

				}else if(n != 0 || n != 1){
					for(int i = 3;i < n;i++){
						if(n % i == 0){
							break;
						}
						if(i == n-1){
							primeCount++;
						}
					}
				}
				n--;
			}
			System.out.println(primeCount);
		}
	}
}