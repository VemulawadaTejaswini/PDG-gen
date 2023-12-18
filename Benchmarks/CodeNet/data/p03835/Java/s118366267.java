import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
	//	int[]x = new int[S/3+1];
	//	int[]y = new int[K/3+1];
	//	int[]z = new int[K/3+1];
		long res = 0;
		for(int i = K; i>=0 && i >= S/3; i--){
			for(int j = K; j>=0 && j>= S/3; j--){
				for(int k = K; k>=0 && k>=S/3; k--){
					if(i+j+k == S){
			//			System.out.println(i+" "+j+" "+k);
						res++;
					}
				}
			}
		}
		System.out.println(res);
	}
}
