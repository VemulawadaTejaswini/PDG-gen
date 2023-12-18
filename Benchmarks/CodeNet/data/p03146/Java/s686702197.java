import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		int[] a = new int[1000001];
		int[] b = new int[1000001];
		a[0] = s;
		b[s]++;
		for(int i = 1; i < a.length; i++) {
			int t = a[i - 1];
			if(t % 2 == 0) {
				a[i] = t / 2;
				//System.out.println(a[i]);
				b[a[i]]++;
				if(b[a[i]] == 2) {
					System.out.println(i + 1);
					System.exit(0);
				}
			}else {
				a[i] = 3 * t + 1;
				b[a[i]]++;
				if(b[a[i]] == 2) {
					System.out.println(i + 1);
					System.exit(0);
				}
			}

		}
	}
}