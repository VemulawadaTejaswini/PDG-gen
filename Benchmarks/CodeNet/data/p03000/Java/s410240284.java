import java.util.*;

public class ABC130B{
	public static void main(String[] $$) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), X = $.nextInt(), b = 0;;
		for (b = 0; X > -1 && b < N; b++){
			X -= $.nextInt();
		}
		System.out.println(b);
		/*
		3 6 3 4 5 -> 2
		4 9 3 3 3 3 -> 4
		*/
	}
}
