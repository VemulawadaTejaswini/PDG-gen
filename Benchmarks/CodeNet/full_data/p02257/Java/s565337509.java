import java.util.Scanner;

public class Main {
	static int MAX_COUNT= 100000000;
	public static void main(String[] args){

		boolean[] isPrimeNumber = createIsPrimeNumber();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i = 0; i <N; i++){
			int temp= sc.nextInt();
			if(isPrimeNumber[temp - 1]){
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
	
	public static boolean[] createIsPrimeNumber(){
		boolean[] isPrimeNumber = new boolean[MAX_COUNT];
		for(int i = 0; i <MAX_COUNT; i++){
			isPrimeNumber[i] = true;
		}
		isPrimeNumber[0] = false;
		for(int i = 2; i < MAX_COUNT; i++){
			if(isPrimeNumber[i - 1]){
				int count = 2;
				while(true){
					if((i * count - 1) >= MAX_COUNT ){
						break;
					}
					isPrimeNumber[i * count - 1] = false;
					count++;
				}
			}
		}
		return isPrimeNumber;
	}
}