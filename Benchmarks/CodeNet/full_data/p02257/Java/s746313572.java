import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i= 0; i <N; i++){
			int inputNumber = sc.nextInt();
			if(isPrimeNumber(inputNumber)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPrimeNumber(int N){
		if(N == 1){
			return false;
		}else if(N == 2){
			return true;
		}
		int devN = N / 2;
		for(int i = 2; i <= devN ;i++){
			if(N % i ==0){
				return false;
			}
		}
		return true;
	}
}