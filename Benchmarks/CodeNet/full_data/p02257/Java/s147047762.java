import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		int n;
		int max = 100000001;
		
		boolean [] x = new boolean[max];
		
		PrimeList(x, max);
		
		n = cin.nextInt();
		
		Output(x, n, 0);
	}
	
	private static void PrimeList (boolean x[], int max){
		int i;
		int j;
		
		for (i = 2; i < max; i++){
			x[i] = true;
		}
		
		for (i = 2; i < 10000; i++){
			if (x[i]){
				for (j = i + i; j < max; j += i){
					x[j] = false;
				}
			}
		}
	}
	
	private static void Output(boolean x[], int n, int count){
		Scanner cin = new Scanner(System.in);
		
		if (n > 0){
			int a = cin.nextInt();
			if (x[a]){
				Output(x, --n, ++count);
			}
			else {
				Output(x, --n, count);
			}
		}
		else {
			System.out.println(count);
		}
	}
}