import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = 0;
		}
		for(int i = 0; i < k; i++) {
			d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int l = sc.nextInt();
				a[l-1] = 1;
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}