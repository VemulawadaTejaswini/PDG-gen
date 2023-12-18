import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] count = new int[4+1];
        for (int i = 0; i < 6; i++) {
            count[sc.nextInt()]++;
        }
        
        int count2 = 0;
        for (int i = 1; i <= 4; i++) {
            if (count[i] == 2) count2++;
        }
        println(count2 == 2 ? "YES" : "NO");
    }

    static int    ni() { return sc.nextInt(); }
    static long   nl() { return sc.nextLong(); }
    static String n()  { return sc.next(); }
    
    static char[] nChars() { return n().toCharArray(); }
    static int[] nInts(int n) { 
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }
    static void println(Object o)  { so.println(o);}
    static void println(long l)    { so.println(l);}
    static void println(char c)    { so.println(c);}
    static void println(double d)  { so.println(d);}
    static void println(boolean b) { so.println(b);}
    
    static void print(Object o)  { so.print(o);}
    static void print(long l)    { so.print(l);}
    static void print(char c)    { so.print(c);}
    static void print(double d)  { so.print(d);}
    static void print(boolean b) { so.print(b);}
}
