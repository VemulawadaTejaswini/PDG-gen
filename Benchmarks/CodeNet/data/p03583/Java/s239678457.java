import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		boolean OK = false;
		for(long n = 1; n <= 3500; n++) {
			for(long h = 1; h <= 3500; h++) {
				if(n * (2 * h - N) + h * (2 * n - N) <= 0) continue;
				if(n * h * N % ((long)4 * n * h - n * N - h * N) == 0) {
					System.out.println(h+" "+n+" "+(n * h * N / ((long)4 * n * h - n * N - h * N)));
					OK = true;
					break;
				}
			}
			if(OK) break;
		}
	}
}
