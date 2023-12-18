import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		int start = 0;
		int packet = 1;
		int gen = 0;
		if (b-a <= 2 || k-a <= 0) {
			System.out.println(k+1);
			return;
		}
		while(start!=k-1) {
			if(packet!=a) {
				packet++;
				start++;
			}else {
				start++;
				packet = 0;
				gen++;
			}
		}
		if(packet==a) {
			System.out.println(gen*b + b);
		}else {
			System.out.println(gen*b + packet);
		}
		
    }

}
