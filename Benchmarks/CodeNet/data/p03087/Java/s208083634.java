import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), Q = s.nextInt();
		int[] a = new int [N];
		a[0] = 0;
		String S = s.next();
		for (int i = 1; i < N; i++){
			String SS = S.substring(i - 1, i + 1);
			//System.out.println(SS);
			a[i] = plus(a[i - 1], SS);
			//System.out.println(a[i]);
		}
		for (int i = 0; i < Q; i++){
			System.out.println(- a[s.nextInt() - 1] + a[s.nextInt() - 1]);
		}
	}
	public static int plus(int a, String s){
		int Flag = 0;
		if (s.equals("AC")){
			Flag = 1;
		}
		return a + Flag;
	}
}
