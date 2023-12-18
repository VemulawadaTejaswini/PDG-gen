import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		int[] arr = new int[]{0, 3, 5, 7};
		HashSet<Long> set = new HashSet<>();
		for (int i = 1; ; i++) {
		    int x = i;
		    long base = 0;
		    while (x > 0) {
		        base *= 10;
		        base += arr[x % 4];
		        x /= 4;
		    }
		    if (base > n * 10) {
		        break;
		    }
		    if (base <= n && is753(base)) {
		        set.add(base);
		    }
		}
		System.out.println(set.size());
   }
   
   static boolean is753(long x) {
       int[] counts = new int[10];
       while (x > 0) {
           counts[(int)(x % 10)]++;
           x /= 10;
       }
       return (counts[0] == 0 && counts[3] != 0 && counts[5] != 0 && counts[7] != 0);
   }
}
