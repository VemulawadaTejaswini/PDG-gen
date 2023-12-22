import java.util.Scanner;

class Prime {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		
		int n;
		boolean [] x = new boolean[100000010];
		
		PrimeList(x);
		
		n = cin.nextInt();
		
		Output(x, n, 0);
	}
	
	private static void PrimeList (boolean x[]){
		int i;
		int j;
		
		for (i = 2; i < 100000010; i++){
			x[i] = true;
		}
		
		for (i = 2; i < 10000; i++){
			if (x[i]){
				for (j = i + i; j < 100000000; j += i){
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