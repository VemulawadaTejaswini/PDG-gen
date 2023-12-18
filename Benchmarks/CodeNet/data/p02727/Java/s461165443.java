import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long[] red = new long[a];
        long[] green = new long[b];
        long[] col = new long[c];
        for(int i=0;i<a;i++)
            red[i]=sc.nextLong();
        for(int i=0;i<b;i++)
            green[i]=sc.nextLong();
        for(int i=0;i<c;i++)
            col[i]=sc.nextLong();

        Arrays.sort(red);
        Arrays.sort(green);
        Arrays.sort(col);
        ArrayList<Long> list = new ArrayList<>();
        for(int i=a-1;i>=a-x;i--) {
            list.add(red[i]);
        }

        for(int i=b-1;i>=b-y;i--) {
            list.add(green[i]);
        }

        for(int i=0;i<c;i++) {
            list.add(col[i]);
        }

        Collections.sort(list);

        long sum=0;
        for(int i=list.size()-1;i>=list.size()-x-y;i--)
            sum+=list.get(i);
        out.println(sum);




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