import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A,B,N,sum;
		boolean isTrue = true;
		sum = 0;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		A = input.nextInt();
		B = input.nextInt();
		
		for(int i = 0; i <= N; i++) {
			if(i<10 && i>=A && i<=B) {
				sum += i;
			}else {
				int tmp_sum = 0;
				int tmp = i;
				while(tmp!=0) {
					tmp_sum += tmp%10;
					tmp/=10;
				}
				if(tmp_sum>=A && tmp_sum<=B) {
					sum += i;
				}
			}
		}		
		System.out.println(sum);
	}

}
