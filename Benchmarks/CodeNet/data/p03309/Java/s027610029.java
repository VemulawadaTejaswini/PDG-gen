import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]a = new int[N];
			int[]b = new int[N];
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				b[i] = a[i]-i-1;
			}
			
			Arrays.sort(b);
			
			long min = Long.MAX_VALUE;
			long goukei = 0;
			
			if(b.length%2==1) {//奇数
				int B = b[b.length/2];
				for(int i = 0;i<N;i++) {
					goukei+=Math.abs(b[i]-B);
				}
				
				System.out.println(goukei);
			}else {
				long goukei1 = 0;
				int b1 = b[(b.length/2)-1];
				int b2 = b[b.length/2];
				
				for(int i = 0;i<N;i++) {
					goukei+=Math.abs(b[i]-b1);
				}
				
				for(int i = 0;i<N;i++) {
					goukei1+=Math.abs(b[i]-b2);

				}
				System.out.println(goukei<goukei1?goukei:goukei1);
				
			}
			
			
			
			
			
			
			
			
		}
	}
}
