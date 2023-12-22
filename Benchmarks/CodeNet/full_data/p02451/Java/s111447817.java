import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();

			for(int i = 0; i < q; i++) {
				int head = 0;
				int foot = n - 1;
				int k = sc.nextInt();
				int j = -1;
				while(head <= foot) {
					int mid = (head + foot) / 2;
					if(a[mid] == k) {
						j = mid;
						break;
					}
					else if(a[mid] < k) {
						head = mid + 1;
					}
					else {
						foot = mid - 1;
					}
				}
				if(j != -1) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
		}
	}
}
