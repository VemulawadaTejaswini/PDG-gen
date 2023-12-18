import javax.print.DocFlavor;
import java.awt.*;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.List;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();
        Point[] points = new Point[N];
        Arrays.setAll(points, i->new Point(nextInt(), nextInt()));

        int[] index = new int[N];
        for(int i=0; i<N; i++){
            index[i] = i;
        }

        double sum = 0;
        int count = 0;
        do{
            for(int i=0; i<N-1; i++){
                sum += points[index[i]].distance(points[index[i+1]]);
            }
            count++;
        }while(nextPermutation(index));
        println(sum/count);
    }

    public static boolean nextPermutation(int[] a) {
        for (int i = a.length - 1; i > 0; --i) {
            if (a[i - 1] < a[i]) {
                int swapIndex = find(a[i - 1], a, i, a.length - 1);
                int temp = a[swapIndex];
                a[swapIndex] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, a.length);
                return true;
            }
        }
        return false;
    }
    private static int find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }


    static Point[] nextArray(Point[] points){
        Point[] array = new Point[points.length-1];
        for(int i=0; i<array.length; i++){
            array[i] = points[i=1];
        }
        return array;
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
