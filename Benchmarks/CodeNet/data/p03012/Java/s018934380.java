import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int[] W = new int[N];
		
		W[0] = in.nextInt();
		for(int i=1; i<N; i++) {
			W[i] = W[i-1]+in.nextInt();
			
		}
		
		int min = W[N-1];
		int sub;
		for(int i=0; i<N-1; i++) {
			sub = Math.abs(W[N-1] - W[i] - W[i]);
			if(sub < min) {
				min = sub;
			}else {
				break;
			}
		}
		System.out.println(min);
		in.close();
	}
}
