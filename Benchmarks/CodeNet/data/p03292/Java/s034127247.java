import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] b=new int[3];

		for(int i=0; i<3; i++) {
			b[i]=sc.nextInt();
		}
		int wa=0;

		Arrays.sort(b);
		for(int i=0; i<2; i++) {
			wa+=Math.abs(b[i+1]-b[i]);
		}
		System.out.println(wa);
	}
}