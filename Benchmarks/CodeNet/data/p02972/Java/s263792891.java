import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		int ans = 0;
		int box[] = new int[n];
		for(int i = n - 1; i >= 0; --i) {
			int tmp = 0;
			int b = i + 1;
			for(int j = b; j < n; j += b) 
				tmp += box[j];
			if(tmp % 2 != a[i]) {
				ans++;
				box[i] = 1;
			}
		}
		System.out.println(ans);
		int s = 0;
		for(int i = 0; i < n; ++i) {
			if(box[i] == 1 && s != 0)
				System.out.print(" " + i);
			if(box[i] == 1 && s == 0) {
				System.out.print(i + 1);
				s++;
			}
		}
	}
}
