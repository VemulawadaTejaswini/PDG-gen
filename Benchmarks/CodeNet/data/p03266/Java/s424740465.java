import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		
		int sum = 0;
		for(int i=1; i<K; i++) {
			if((i+i)%K != 0) {
				continue;
			}
			int c = (N+i)/K;
			sum += c*c*c;
			
		}
		int d = N/K;
		sum += d*d*d;
	
		System.out.println(sum);
		in.close();
	}
}
