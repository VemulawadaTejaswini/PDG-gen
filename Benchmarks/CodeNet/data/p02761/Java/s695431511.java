import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		
		for(int i=0;i<m;i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if(n!=1 && s[i]==1&&c[i]==0) {
				System.out.println("-1");
				return;
			}
		}
		
		int b;
		f: for(int i=0;i<1000;i++) {
			for(int k=0;k<m;k++) {
				b = (int)Math.pow(10, n-s[k]);
				if((i%(10*b))/b != c[k]) {
					continue f;
				}
			}
			System.out.println(i);
			return;
		}
		System.out.println("-1");
	}

}
