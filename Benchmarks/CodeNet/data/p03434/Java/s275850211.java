import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int Alice = 0, Bob = 0;
		int max = 0;
		boolean t = true;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(a[j] >= max) max = a[j];
			}
			if(t == true) {
				Alice += max;
			}
			else {
				Bob += max;
			}
			for(int j = 0; j < n; j++) {
				if(a[j] == max) {
					a[j] = 0;
					break;
				}
			}
			max = 0;
			t = !t;
		}		
		System.out.println(Alice - Bob);
	}
}
