import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer>[] sets = new HashSet[m];
		for (int i = 0; i < m; i++) {
		    sets[i] = new HashSet<Integer>();
		    int x = sc.nextInt();
		    for (int j = 00; j < x; j++) {
		        sets[i].add(sc.nextInt() - 1);
		    }
		}
		boolean[] arr = new boolean[m];
		for (int i = 0; i < m; i++) {
		    arr[i] = sc.nextInt() == 1;
		}
		int count = 0;
		for (int i = 0; i < Math.pow(2, n); i++) {
		    boolean[] state = getState(n, i);
		    boolean flag = true;
		    for (int j = 0; j < m && flag; j++) {
		        boolean now = false;
		        for (int x : sets[j]) {
		            now ^= state[x];
		        }
		        flag = (now == arr[j]);
		    }
		    if (flag) {
		        count++;
		    }
		}
		System.out.println(count);
   }
   
   static boolean[] getState(int n, int value) {
       boolean[] ret = new boolean[n];
       for (int i = 0; i < n; i++) {
           ret[i] = (value % 2 == 1);
           value /= 2;
       }
       return ret;
   }
}
