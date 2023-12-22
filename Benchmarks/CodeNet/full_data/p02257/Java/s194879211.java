import java.util.Scanner;

class Main {
	public static void main(String[] args){
		int max = 100000001;
		boolean [] x = new boolean[max];
		
		PrimeList(x, max);
		
		Output(x);
	}
	
	private static void PrimeList (boolean x[], int max){
		int i;
		int j;
		double sqrt = Math.sqrt(max);
		
		for (i = 2; i < max; i++){
			x[i] = true;
		}
		
		for (i = 2; i < sqrt; i++){
			if (x[i]){
				for (j = i + i; j < max; j += i){
					x[j] = false;
				}
			}
		}
	}
	
	private static void Output(boolean x[]){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a;
		int count = 0;
		
		while (n > 0){
			a = cin.nextInt();
			if (x[a]){
				count++;
			}
			n--;
		}
		System.out.println(count);
	}
}