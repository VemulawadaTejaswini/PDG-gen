import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] n = new int[3];
		int[] x = new int[N];
		for(int i = 0; i < N; i++)
			x[i] = Character.getNumericValue(S.charAt(i));
		int[] y = new int[N-1];
		for(int i = 1; i < N; i++)
			y[i-1] = Math.abs(x[i]-x[i-1]);
		n[y[0]]++;
		n[y[N-2]]++;
		for(int i = 1; i < N-1; i++)
			n[y[i]] += 2;
		for(int i = 1; i < 3; i++)
			n[i] %= 2;
		if(n[1] == 0 && n[2] == 0)
			System.out.println(0);
		else if(n[2] == 1 && n[1] == 0)
			System.out.println(2);
		else
			System.out.println(1);
	}

}