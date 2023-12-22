import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int now = 1;
		long count = 0;

		for(; k > 0 ; k--) {
			count++;
			now = a[now - 1];
			if(b[now - 1] == 0) {
				b[now - 1] = count;
			}
			else {
				k %= (count - b[now - 1]);
              if(k == 0){
                System.out.println(now);
                return;
              }
			}
		}
		System.out.println(now);



	}


}

