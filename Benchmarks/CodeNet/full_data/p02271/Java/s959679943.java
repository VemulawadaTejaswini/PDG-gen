import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < (1 << n); i++) {
            int temp=0;
            for (int j = 0; j < n; j++) {
                if(((i>>j)&1)==1){
                    temp+=a[j];
                }
            }
            ts.add(temp);
        }
        for (int i = 0; i < m; i++) {
            out.println(ts.contains(b[i])?"yes":"no");
        }
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner scanner = new Scanner(System.in);

        static String next() {
            return scanner.next();
        }

        static String nextLine() {
            return scanner.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(scanner.next());
        }

        static long nextLong() {
            return Long.parseLong(scanner.next());
        }

        static double nextDouble() {
            return Double.parseDouble(scanner.next());
        }

        static boolean hasNext() {
            return scanner.hasNext();
        }

        static boolean hasNextInt() {
            return scanner.hasNextInt();
        }

        static boolean hasNext(String str) {
            return scanner.hasNext(str);
        }
    }

}
