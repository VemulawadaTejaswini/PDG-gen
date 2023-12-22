import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		long max = 1000000000000000000L;
		           
		long ans = 1;
		for(int n=0; n<N; n++) {
			long A = in.nextLong();
			if(A == 0) {
				ans = 0;
				break;
			}
			ans *= A;
			if (ans > max || ans < 0) {
				ans = -1;
				break;
			}
		}
		
		System.out.println(ans);
		
		in.close();
	}
}
