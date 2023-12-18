
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] kusi=new int[2*N];
		int wa=0;
		for(int i=0; i<2*N; i++){
			kusi[i]=sc.nextInt();
		}
		Arrays.sort(kusi);

		for(int i=0; i<N; i++) {
			wa+=Math.min(kusi[i*2], kusi[i*2+1]);
		}
		System.out.println(wa);
	}
}
