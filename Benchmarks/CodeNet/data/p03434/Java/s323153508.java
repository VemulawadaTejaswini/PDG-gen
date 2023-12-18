import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int work, idx;
		for(int i = 0; i < n; i++) {
			idx = i;
			for(int k = i + 1; k < n; k++) {
				if(a[i] < a[k]) {
					idx = k;
				}
				work = a[i];
				a[i] = a[idx];
				a[idx] = work;
			}
		}
		int Alice = 0, Bob = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				Alice += a[i];
			} else {
				Bob += a[i];
			}
		}
		System.out.println(Alice - Bob);
	}
}
