import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		sc.close();
		int[] v = new int[4];
		for(int i = 0; i < 3; i++) {
			v[a[i]]++;
			v[b[i]]++;
		}
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < 4; i++) {
			if(v[i] == 0) {
				System.out.println("NO");
			}else {
				if(v[i] % 2 == 1) {
					c1++;
				}else {
					c2++;
				}
			}
		}
		if(c2 == 4) {
			System.out.println("YES");
		}else {
			if(c1 == 2 &&c2 == 2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}