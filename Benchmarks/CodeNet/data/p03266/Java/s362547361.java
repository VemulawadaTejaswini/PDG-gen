import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int temp = alloc(k);
		for (int i = temp; i <= n; i+=temp) {
			for (int j = i+k; j <= n ; j+=k) {
				count += 6;
//				System.out.println(i);
//				System.out.println(j);
			}
			if ((i*2) % k == 0) {
//				System.out.println("zzz");
//				System.out.println(i);
//				System.out.println("zzz");
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static int alloc(int k) {
		if (k % 2 == 0) {
			return k / 2;
		} else {
			return k;
		}
	}
}
