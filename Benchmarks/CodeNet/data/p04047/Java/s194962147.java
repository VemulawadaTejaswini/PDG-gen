

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int spit[] = new int[N*2];
		for(int i=0;i<N*2;i++){
			spit[i] = sc.nextInt();

		}
		sc.close();
		Arrays.sort(spit);
		int ans=0;
		for(int i=0;i<N;i++){
			ans += spit[i*2];
		}
		System.out.println(ans);
	}
}
