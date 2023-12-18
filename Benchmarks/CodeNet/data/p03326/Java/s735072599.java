import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[][] = new long[n][3];
        for(int i=0;i<n;i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
            a[i][2] = sc.nextLong();
        }
        long max=0;
        for(int j=0;j<8;j++) {

            ArrayList<Long> list = new ArrayList<>();
            for(int i=0;i<n;i++) {
                long sum=0;
                for(int k=0;k<3;k++) {
                    if((j>>k&1)==1)
                        sum+=a[i][k];
                    else sum-=a[i][k];
                }
                list.add(sum);
            }

            Collections.sort(list);
            long res=0;
            for(int i=0;i<m;i++) {
                res+=(list.get(n-i-1));
            }

            max = Math.max(max,res);
        }
        out.print(max);


        out.flush();
        out.close();
    }

    //solution functions here

    /*
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * ******************************************************************************************************************************
     * #########  #######  ######   ########  ##  ###   ##  ##    ##   #######  ##    ##   #######  ##   ##  #######   ########
     * ##    ###  ##       ##       ########  ##  ## #  ##   ##  ##    ##       ##    ##   ##       ##  ##   ##        ##    ##
     * ##    ###  #######  ######      ##     ##  ##  # ##     ##      #######  ##    ##   ##       ####     #######   ########
     * ##    ###  ##           ##      ##     ##  ##   ###     ##      ##       ##    ##   ##       ##  ##   ##        ##   ##
     * #########  #######  ######      ##     ##  ##    ##     ##      ##       ########   #######  ##   ##  #######   ##     ##
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     *******************************************************************************************************************************
     */

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