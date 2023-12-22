import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] w = new int[10];
		int[] k = new int[10];
		for(int i=0;i<10;i++){
			w[i]=stdIn.nextInt();
		}
		for(int i=0;i<10;i++){
			k[i]=stdIn.nextInt();
		}
		Arrays.sort(w);
		Arrays.sort(k);
		int sum_w=0, sum_k=0;
		for(int i=7;i<10;i++){
			sum_w+=w[i];
			sum_k+=k[i];
		}
		System.out.println(sum_w+" "+sum_k);
	}
}