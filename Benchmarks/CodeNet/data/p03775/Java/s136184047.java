import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		
		long k = (int) Math.sqrt(N);
		while(N%k!=0){
			k--;
		}
		System.out.println(func(k,N/k));

	}
	
	public static int func(long a, long b){
		return Math.max(String.valueOf(a).length(), String.valueOf(b).length());
	}

}