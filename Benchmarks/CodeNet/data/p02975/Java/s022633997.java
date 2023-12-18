import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		
		if(N%3==0) {
			if(a[0]==a[N/3-1] && a[N/3]==a[N*2/3-1] && a[N*2/3]==a[N-1] && (a[0]^a[N/3])==a[N*2/3]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println(a[N-1]==0 ? "Yes" : "No");
		}
		
		sc.close();
	}
}

