import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        int val=(sum+(4*m-1))/(4*m);
        int count=0;
        for(int i=0;i<n;i++) {
            if(a[i]>=val) {
                count++;
            }
        }

        if(count>=m)
            out.println("Yes");
        else
            out.println("No");




        out.flush();
        out.close();
    }

    //solution functions here


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}

/* *****************************************************************************************************************************
 * I'M NOT IN DANGER, I'M THE DANGER!!!
 * *****************************************************************************************************************************
 */