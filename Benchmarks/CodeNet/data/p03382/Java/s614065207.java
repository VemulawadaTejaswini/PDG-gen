import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		
		int ai = a[N-1];
		int aj = a[0];
		for(int i=1; i<N-1; i++) {
			if(Math.min(a[i], ai-a[i]) > Math.min(aj, ai-aj))
				aj = a[i];
		}
		System.out.println(ai + " " + aj);
		sc.close();
	}
}
