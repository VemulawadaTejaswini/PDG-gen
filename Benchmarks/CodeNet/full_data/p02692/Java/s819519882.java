
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int [] vals = sc.nextIntArr(3);
        long sum =1l*vals[0]+vals[1]+vals[2];
        int[][]nxt = new int[3][n+1];
        nxt[0][n]=nxt[1][n]=nxt[2][n]=n;
        char[][]a= new char[n][2];
        for (int i =0;i<n;i++)a[i]=sc.next().toCharArray();
        for (int i =n-1;i>=0;i--){
            for (int j =0;j<3;j++)
                nxt[j][i]=nxt[j][i+1];
            if (i<n-1) {
                nxt[a[i+1][0] - 'A'][i] = i+1;
                nxt[a[i+1][1] - 'A'][i] = i+1;
            }
        }
        if (sum==0)
            pw.println("No");
        else {
            boolean valid = true;
            StringBuilder sol = new StringBuilder();
            for (int i =0;i<n;i++){
                char[]s = a[i];
                int id1=s[0]-'A';
                int id2=s[1]-'A';
                if (vals[id1]==vals[id2]&&vals[id1]==0){
                    valid=false;
                    break;
                }
                if (vals[id1]>vals[id2]){
                     sol.append(s[1]+"\n");
                     vals[id2]++;
                     vals[id1]--;
                }
                else if (vals[id1]<vals[id2]){
                    sol.append(s[0]+"\n");
                    vals[id2]--;
                    vals[id1]++;
                }
                else {
                    if (nxt[id1][i]<nxt[id2][i]){
                        sol.append(s[0]+"\n");
                        vals[id2]--;
                        vals[id1]++;
                    }
                    else {
                        sol.append(s[1]+"\n");
                        vals[id2]++;
                        vals[id1]--;
                    }
                }
            }
            if (valid){
                pw.println("Yes");
                pw.print(sol);
            }
            else pw.println("No");
        }
        pw.close();

    }
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}
