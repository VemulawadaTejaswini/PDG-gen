import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    int n = scanner.nextInt();
                    int[] a = new int[n];
                    int[] b = new int[n];
                    int[] c = new int[n];
                    for (int i = 0; i < n; i++) {
                         a[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                         b[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                         c[i] = scanner.nextInt();
                    }
                    Arrays.sort(a);
                    Arrays.sort(b);
                    Arrays.sort(c);
                    int total = 0;
                    int amax = a[n-1];
                    int bmax = b[n-1];
                    int cmax = c[n-1];
                    int aindex = n-1;
                    int bindex = n-1;
                    for (int i = 1; i <= n; i++) { 
                       if (i != 1 && c[n-i] == c[n-i+1]) {
                            total = total + aindex;
                            continue;
                       }
                       while(b[bindex] >= c[n-i]) {
                           if (--bindex < 0) { break;}
                       }
                           if (--bindex < 0) { break;}
                       while (a[aindex] >= b[bindex]) {
                           if (--aindex < 0) {break;}
                        }
                           if (--aindex < 0) {break;}
                       total = total + (aindex + 1);
                    }
                    System.out.println(total);
		 } 
}