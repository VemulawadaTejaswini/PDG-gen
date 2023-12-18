import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] hen=new int[N];
		int max=0;
		for(int i=0; i<N; i++) {
			hen[i]=sc.nextInt();
		}
		Arrays.sort(hen);
		for(int i=0; i<N-1; i++) {
			max+=hen[i];
		}
		if(max>hen[N-1]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}
}