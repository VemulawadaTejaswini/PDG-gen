import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] as = new long[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			as[i] = sc.nextLong();
			sum = sum ^ as[i];
		}
		for(long i: as){
			System.out.println(sum ^ i);
		}
	}
}
