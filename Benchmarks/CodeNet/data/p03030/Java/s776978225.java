import java.util.*;

public class Main {
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), pmax = 100;
		String[] P = new String [N];
		for (int i = 0; i < N; i++){
			P[i] = $.next() + "_" + (pmax * 11 - $.nextInt()) + "_" + (i + 1);
		}
		Arrays.sort(P);
		for (int i = 0; i < N; i++){
			System.out.println(P[i].split("_")[2]);
		}
		/*
		6 khabarovsk 20 moscow 10 kazan 50 kazan 35 moscow 60 khabarovsk 40 -> 3 4 6 1 5 2
		10 yakutsk 10 yakutsk 20 yakutsk 30 yakutsk 40 yakutsk 50 yakutsk 60 yakutsk 70 yakutsk 80 yakutsk 90 yakutsk 100 -> 10 9 8 7 6 5 4 3 2 1
		*/
	}
}
