import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		long B = s.nextLong();
		long N = s.nextLong();
		
		long maxfanc=0;
		/*
		for(long x=0; x<=N; x++) {
			if((A*x)/B - A*(x/B) > maxfanc) {
				maxfanc = (A*x)/B - A*(x/B);
						
			}
		}
		System.out.println(maxfanc);*/
		
		System.out.println((A*N)/B - A*(N/B));
	}

}