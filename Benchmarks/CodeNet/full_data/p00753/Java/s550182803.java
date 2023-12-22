import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int Max = 1000000;
		int num[] = new int[Max];
		int N = 0; // ??°???????????°

		for(int i = 0; i < Max; i++){
			if(num[i] == 0){
				break;
			}
			num[i] = sc.nextInt();
			N++;
		}

		for(int i = 0; i < N; i++){
			System.out.println(countPrime(num[i]));
		}




	}

	public static int countPrime(int n){
		int count=0;

		for(int i = 1; i <= n; i++){
			if(primeJudge(i)==true){
				count++;
			}
		}

		return count;
	}


	public static boolean primeJudge(int n){// prime -> true

		if(n < 2){
			return false;
		}

		for(int i = 0; i < n; i++){
			if(n % i == 0 ){
				return false;
			}
		}

		return true;
	}


}