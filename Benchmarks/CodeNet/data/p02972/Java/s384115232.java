import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[N];
		int count = 0;
		for(int i = N; i > 0; i--) {
			int tmp = 0;
			for(int j = 2; i*j<=N; j++) {
				if(a[i*j-1] == 1) {
					tmp++;
				}
			}
			if(a[i-1] == 0 && tmp % 2 == 0) {
				b[i-1] = 0;
			}
			else if(a[i-1] == 1 && tmp % 2 == 0) {
				b[i-1] = 1;
				count++;
			}
			else if(a[i-1] == 0 && tmp % 2 == 1) {
				b[i-1] = 1;
				count++;
			}
			else {
				b[i-1] = 0;
			}
		}
		System.out.println(count);
		for(int i = 0; i < N; i++) {
			if(b[i] == 1)
			System.out.println(i+1);
		}
		
		sc.close();
	}

}
