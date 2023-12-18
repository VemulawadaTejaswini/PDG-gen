import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long [] left =new long[1000000000];
		long [] right =new long[1000000000];
		long leftMax = 0;
		long rightMin = 0;

		for(int i = 1; i <= N; i++) {
			left[i-1] = A * i / B;
			if(i > 1) {
				leftMax = Math.max(leftMax,left[i-1]);
			}else if(i == 1){
				leftMax = left[i-1];
			}

			right[i-1] = i / B;
			if(i > 1) {
				rightMin = Math.min(rightMin,right[i-1]);
			}else if(i == 1){
				rightMin = right[i-1];
			}
		}
		System.out.println(leftMax - rightMin);
		sc.close();
	}
}
