import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[T];
		for(int i = 0; i<T; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int x = a[T-1];

		for(int i = T-2; i>=0; i--){
			x -= a[i];
		}
		if(x<=0){
			System.out.println(0);
		}else{
			System.out.println(x-1);
		}
	}
}