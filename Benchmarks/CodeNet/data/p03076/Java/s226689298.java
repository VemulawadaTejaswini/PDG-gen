
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N =new int[5];
		int[] add =new int[5];
		int minmod = 10;
		int mini = 0;

		long sum=0;

		for (int i = 0; i < 5; i++) {
			N[i] =sc.nextInt();
			add[i] = N[i] % 10;
			if (add[i] != 0) {
				if (Math.min(minmod, add[i]) == add[i]) {
					minmod = Math.min(minmod, add[i]);
					mini = i;
				}
			}
		}
		if (minmod < 10) {
			for (int i = 0; i < 5; i++) {
				if (i == mini) {
					continue;
				}else {
					int let = N[i];
					if (let % 10 !=0) {
						let =(let/10 + 1)*10;
					}
					sum+=let;
				}
			}
			sum+=N[mini];
		} else {
			for (int i : N) {
				if (i % 10 !=0) {
					i =(i/10 + 1)*10;
				}
				sum+=i;
			}
		}

		System.out.println(sum);


	}
}


