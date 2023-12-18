import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 100000;
		int[] sums = new int[MAX];
		int idx = 3;
		for (int i = 3; i < MAX; i++) {
		    sums[i] += sums[i - 1];
		    if (isPrime(i) && isPrime((i + 1) /2)) {
		        sums[i]++;
		    }
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    sb.append(sums[right] - sums[left - 1]).append("\n");
		}
       System.out.print(sb);
   }
   
   static boolean isPrime(int x) {
       if (x == 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(x); i++) {
           if (x % i == 0) {
               return false;
           }
       }
       return true;
   }
}


