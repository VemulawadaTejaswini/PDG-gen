import java.util.*;

public class Main {
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), L = $.nextInt();
		if (L > 0){
			//System.out.println("Case1");
			System.out.println(L * N + (((N - 1) * N) / 2) - L);
		}
		else if (L < -N){
			//System.out.println("Case2");
			System.out.println(L * N + (((N - 1) * N) / 2) - (L + N - 1));
		}
		else{
			//System.out.println("Case3");
			System.out.println(L * N + (((N - 1) * N) / 2));
		}
		/*
		5 2 -> 18
		3 -1 -> 0
		30 -50 -> -1044
		*/
	}
}
