import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] W = new int[10];
		int[] K = new int[10];
		
		for(int i = 0; i < 10; i++)
			W[i] = sc.nextInt();
		
		for(int i = 0; i < 10; i++)
			K[i] = sc.nextInt();
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		int w = W[9] + W[8] + W[7];
		int k = K[9] + K[8] + K[7];
			
		System.out.println(w + " " + k);
		
		sc.close();
	}
}