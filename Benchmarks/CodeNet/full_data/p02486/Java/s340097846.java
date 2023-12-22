import java.util.Scanner;

class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		while (true){
			int N = input.nextInt();
			int X = input.nextInt();
			if (N == 0 && X == 0) break;
			
			System.out.println(pat(N, X, 3));
		}
		
	}
	
	static int pat(int n, int x, int cost)
	{
		if (cost == 0 && x == 0) return 1;
		else if (x == 0 || n == 0) return 0;
		
		
		return pat(n - 1, x - n, cost - 1) + pat(n - 1, x, cost);
	}
}