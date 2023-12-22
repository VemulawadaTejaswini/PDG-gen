import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int health1 = nextInt();
        int attack1 = nextInt();
        int health2 = nextInt();
        int attack2 = nextInt();
        while (health1>0 && health2>0) {
            health2-=attack1;
            if (health2<=0) {
                System.out.println("Yes");
                return;
            }
            health1-=attack2;
            if (health1<=0) {
                System.out.println("No");
                return;
            }
        }
        if (health1<=0) { //reee captialization
            System.out.println("No");
        }
        else if (health2<=0) {
            System.out.println("Yes");
        }
    }
    
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}


