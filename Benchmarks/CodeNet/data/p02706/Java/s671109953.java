import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long M = sc.nextLong(),N = sc.nextLong();
		long total = 0;
		for(int i = 0;i<N;i++) {
			total += sc.nextInt();
		}
		if(M-total<0) {
			System.out.println(-1);
		}else {
			System.out.println(M-total);
		}
	}

}
