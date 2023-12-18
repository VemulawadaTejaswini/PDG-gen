import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int a[] = new int [N];

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int cnt = 0;

		for(int i : a) {
            X -= i;
            if(X < 0) {
            	break;
            }
            cnt++;
        }

		System.out.println(cnt);
		sc.close();
	}

}
