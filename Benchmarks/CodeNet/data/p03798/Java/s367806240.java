import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = (S + S.charAt(0)).toCharArray();
		int[] a = new int[N+2];
		for(int i = 0; i <= 1; i++) {
			for(int j = 0; j <= 1; j++) {
				a[0] = i;
				a[1] = j;
				for(int k = 2; k <= N+1; k++) {
					if(a[k-1] == 0)
						a[k] = s[k-1] == 'o' ? a[k-2] : (a[k-2]+1)%2;
					else
						a[k] = s[k-1] != 'o' ? a[k-2] : (a[k-2]+1)%2;
				}
				if(a[0] == a[N] && a[1] == a[N+1]) {
					for(int k = 0; k < N; k++)
						System.out.print(a[k] == 0 ? "S" : "W");
					return;
				}
			}
		}
		System.out.println(-1);	
	}

}