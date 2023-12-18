import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		
		int[] a = new int[n+1];
		for (int i = 1; i <= n; i++) a[i] = k;
		
		for(int i = 0; i < q; i++) {
			int aa = sc.nextInt();
			//System.out.println(aa);
			for(int j = 1; j <= n; j++) {
				if(j != aa) a[j]--;
				//System.out.println(a[i]);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if(a[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		
		
	}

}
