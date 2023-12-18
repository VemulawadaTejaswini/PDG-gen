import java.io.*;
import java.util.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        String s[] = new String[h];
        char[][] ch = new char[h][w];
        int ans=(int)1e9;
        for(int i=0;i<h;i++) {
            s[i] = sc.next();
            ch[i]= s[i].toCharArray();
        }
        for(int j=0;j<(1<<h-1);j++) {
            int count = 0;
            ArrayList<Integer> list[] = new ArrayList[w];
            for(int i=0;i<w;i++) {
                list[i] = new ArrayList<>();
                int add=0;
                for(int l=0;l<h;l++) {
                    add += ((int)ch[l][i]-48)&1;
                    if((j>>l&1)==1) {
                        list[i].add(add);
                        add=0;
                    }
                }
                list[i].add(add);
                for(int vi : list[i])
                    if(vi>k)
                        count=(int)1e9;
            }
            int[] sum = new int[list[0].size()];
            int split=0;
            for(int i=0;i<w;i++) {
                for(int l=0;l<list[0].size();l++) {
                    if(sum[l]+list[i].get(l)>k)
                        split=1;
                }

                if(split==1) {
                    split=0;
                    count++;
                    Arrays.fill(sum,0);
                }

                for(int l=0;l<list[0].size();l++) {
                    sum[l] += list[i].get(l);
                }
            }

            ans=Math.min(count+list[0].size()-1,ans);
        }

        out.println(ans);

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