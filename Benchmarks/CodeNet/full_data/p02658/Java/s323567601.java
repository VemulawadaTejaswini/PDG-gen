import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int N = a.nextInt();
		long sum = 1;
		long B = 0;
		long AA1 = (long)Math.pow(10, 18);
		long AA = 1000000000000000000L;

		for(int i = 0; i < N; i++) {
			B = a.nextLong();
			sum *= B;
		}
		if(sum > AA1) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
		}