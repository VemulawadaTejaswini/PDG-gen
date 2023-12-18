
import java.util.*;
import java.io.*;

public class Main {
    static int countr(char[]s){
        int ans=0;
        int b=0;
        for (int i =0;i<s.length;i++){
            if (s[i]==')') {
                if (b == 0)
                    ans++;
                else b--;
            }
            else b++;
        }
        return ans;
    }
    static int countl(char[]s){
        int ans=0;
        int b=0;
        for (int i =s.length-1;i>=0;i--){
            if (s[i]=='(') {
                if (b == 0)
                    ans++;
                else b--;
            }
            else b++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]r = new int[n];
        int[]l= new int[n];
        ArrayList<Integer>ids= new ArrayList<>();
        for (int i =0;i<n;i++){
            char[]s = sc.next().toCharArray();
            r[i]=countr(s);
            l[i]=countl(s);
            ids.add(i);
        }
        System.err.println(Arrays.toString(l));
        System.err.println(Arrays.toString(r));

        Collections.sort(ids,(a,b)->r[a]-r[b]);
        int curl=0;
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->(l[b]-r[b])-(l[a]-r[a]));//take the seq that will make greater (left - right) diff
        int id=0;
        boolean valid= true;
        while (id<ids.size()&&valid){
            while (id<ids.size()&&curl>=r[ids.get(id)])
                pq.add(ids.get(id++));
            if (pq.isEmpty())
                break;
            int nxt =pq.poll();
            System.err.println(nxt);
            if (r[nxt]>curl){
                valid=false;
                break;
            }
            curl+=l[nxt]-r[nxt];
        }
        while (!pq.isEmpty()){
            int nxt =pq.poll();
            if (r[nxt]>curl){
                valid=false;
                break;
            }
            curl+=l[nxt]-r[nxt];
        }
        valid&=id==n&&curl==0;
        pw.println(valid?"Yes":"No");
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
