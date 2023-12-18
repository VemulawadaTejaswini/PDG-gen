import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N+1];
		int[] ar = new int[N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = sc.nextInt();
			ar[i] = arr[i];
		}
		Arrays.sort(ar);
		for(int i=1; i<=N; i++) {
			
			if(arr[i] >= ar[N/2+1]) {
				System.out.println(ar[N/2]);
			} else {
				System.out.println(ar[N/2+1]);
			}
		}
		
				

	}

}
