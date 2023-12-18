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
      boolean loop = false;

		for(; k > 0 ; k--) {
			count++;
			now = a[now - 1];
          if(!loop && b[now - 1] == count){
				k %= (count - b[now - 1]);
              loop = true;
			}
				b[now - 1] = count;
		}
		System.out.println(now);



	}


}

