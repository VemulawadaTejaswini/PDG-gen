import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long all = 1;
        for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
          if(a[i]== 0){
            System.out.println(0);
            return;
          } 

		}
      


		for(int i = 0 ; i < n ; i++) {
          if(all > 10000000000L && a[i] > 10000000000L) {
            System.out.println(-1);
			return;
          }
			all *= a[i];
          if(all > 1000000000000000000L) {
			System.out.println(-1);
			return;
		}
		}

			System.out.println(all);


	}

}


