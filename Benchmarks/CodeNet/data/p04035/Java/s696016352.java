import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		
		int idx = -1;
		for(int i=0; i<N-1; i++) {
			if(a[i]+a[i+1]>=L) {
				idx = i;
				break;
			}
		}
		
		if(idx>=0) {
			System.out.println("Possible ");
			for(int i=0; i<idx; i++)
				System.out.println(i+1);
			for(int i=N-2; i>=idx; i--)
				System.out.println(i+1);
		} else {
			System.out.println("Impossible ");
		}
		
		sc.close();
	}
}
