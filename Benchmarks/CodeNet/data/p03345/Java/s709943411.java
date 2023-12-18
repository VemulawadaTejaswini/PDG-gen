
import java.io.*;
import java.util.*;
import javafx.util.Pair;
import javax.swing.*;

public class Main {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        
     int a=Reader.nextInt();
     int b=Reader.nextInt();
     int c=Reader.nextInt();
     
     long k=Reader.nextInt();
     
     if(k%2==0)
         pw.println(a-b);
     
     else {
     long ans=(long)(b+c)-(long)(a+c);
             if(Math.abs(ans)>=1e18)
                 pw.println("Unfair");
             else pw.println(ans);
     
     
     
     }
     pw.close();
        
  
    }
}//end class

class Reader {

    static BufferedReader reader;
    static StringTokenizer tokenizer;

    public static int pars(String x) {
        int num = 0;
        int i = 0;
        if (x.charAt(0) == '-') {
            i = 1;
        }
        for (; i < x.length(); i++) {
            num = num * 10 + (x.charAt(i) - '0');
        }

        if (x.charAt(0) == '-') {
            return -num;
        }

        return num;
    }

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static void init(FileReader input) {
        reader = new BufferedReader(input);
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return pars(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

class pair implements Comparable<pair> {

    long first, second;

    pair() {
    }

    pair(long a, long b) {
        first = a;
        second = b;
    }

    public int compareTo(pair q) {
        if (first > q.first) {
            return 1;
        } else if (first < q.first) {
            return -1;
        }
        if (second > q.second) {
            return -1;
        } else if (second < q.second) {
            return 1;
        }
        return 0;
    }
}
