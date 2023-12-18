import java.util.*;
public class Main {

	static boolean isprime(int N) {
		if(N <= 1)
			return false;
		else if(N == 2)
			return true;
		for(int i = 2; i <= Math.sqrt(N); i++)
			if(N % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 0, j = 11;
		while(i < N) {
			if(isprime(j) && j % 5 == 1) {
				System.out.print(j + " ");
				i++;
			}
			j+=2;
		}
	}

}
