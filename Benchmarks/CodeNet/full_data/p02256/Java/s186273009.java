import java.util.Scanner;
class Main {
	public static void main(String[] args){
		final int Number=100;
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int M = Integer.parseInt(sc.next());
			int c =gcd(N,M);
			System.out.println(c);
		}
	}
	public static int gcd(int N, int M){
		int max=Math.max(N, M);
		int min=Math.min(N, M);
		
		if(max%min==0){
			return min;
		}else{
			return gcd(max%min,min);
		}
	}
}