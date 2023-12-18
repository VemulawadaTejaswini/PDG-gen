import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long N=scan.nextLong();
		long K=scan.nextLong();
		long min=N;
		for(int i=0;i<N;i++){
			N=Math.abs(N-K);
			min=Math.min(min,N);
		}
		System.out.println(min);

	}

}
