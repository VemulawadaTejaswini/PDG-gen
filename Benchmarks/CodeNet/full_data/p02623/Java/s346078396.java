import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int c = 0;
		long a = sc.nextInt();
		long b = sc.nextInt();
		int[] aa = new int[(int) (a + b)];
		long k = sc.nextInt();
		for (int i = 0; i < aa.length; i++) {
			aa[i] = sc.nextInt();
			max += aa[i];
		}
		if (max <= k) {
			System.out.println(a + b);
		}else if(aa[0]>k){
			System.out.println(0);
		} else {
			for (int i = 0; i < aa.length || a < aa.length; i++) {
				if (aa[i] > aa[(int) a]) {
					sum += aa[(int) a];
					a++;
					c++;
				} else {
					sum += aa[i];
					c++;
				}
				if (sum > k) {
					System.out.println(c);
					break;
				}

			}
		}
		sc.close();
	}
}