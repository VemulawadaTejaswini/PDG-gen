import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < 4; i++) {
				b[i] = sc.nextInt();
			}
			int c1 = 0;
			int c2 = 0;
			for(int i = 0; i < 4; i++) {
				if(a[i] == b[i]) {
					c1++;
				}
				for(int j = 0; j < 4; j++) {
					if(a[i] == b[j]) {
						c2++;
					}
				}
			}
			System.out.printf("%d %d\n", c1, c2 - c1);
		}
		sc.close();
	}
}
