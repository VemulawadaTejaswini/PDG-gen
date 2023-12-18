import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long W0 = (W + 1) / 2;
		long W1 = W - W0;
		if(W0 == W1){
			System.out.println(H * W0);
		}else{
			if(H % 2 == 0){
				System.out.println((H / 2) * (W0 + W1));				
			}else{
				long r = (H / 2) * (W0 + W1) + W0;
				System.out.println(r);				
			}
		}
	}
}
