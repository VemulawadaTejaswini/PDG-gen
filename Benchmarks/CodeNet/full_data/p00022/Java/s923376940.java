import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] in;
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			in = new int[n];
			for(int i = 0; i < n; i++){
				in[i] = sc.nextInt();
			}
			System.out.println(maxSumSequence(in));
		}
		sc.close();
	}
	
	static long maxSumSequence(int[] args) {
		long maxsum = 0;
		for(int i = 0; i < args.length - 1; i++) {
			for(int j = i+1; j < args.length; j++) {
				long sum = sumSequence(args, i, j);
				if(sum > maxsum) {
					maxsum = sum;
				}
			}
		}
		return maxsum;
	}
	
	static long sumSequence(int[] args, int from, int to) {
		int result = 0;
		for(int i = from; i <= to; i++) {
			result += args[i];
		}
		return result;
	}
}