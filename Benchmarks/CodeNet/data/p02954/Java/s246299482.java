import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>adj[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        char[]s= sc.nextLine().toCharArray();
        int n = s.length;
        int[]mod= new int[2];
        int[]ans = new int[n];
        for (int i =0;i<n;i++){
            int tmp=mod[1];
            mod[1]=mod[0];
            mod[0]=tmp;
            if (s[i]=='R')
            mod[0]++;
            if (s[i]=='L'&&s[i-1]=='R'){
                ans[i]=mod[0];
                ans[i-1]=mod[1];
                mod[0]=0;
                mod[1]=0;
            }
        }
        mod= new int[2];
        for (int i =n-1;i>=0;i--){
            int tmp=mod[1];
            mod[1]=mod[0];
            mod[0]=tmp;
            if (s[i]=='L')
            mod[0]++;
            if (s[i]=='R'&&s[i+1]=='L'){
                ans[i]+=mod[0];
                ans[i+1]+=mod[1];
                mod[0]=0;
                mod[1]=0;
            }
        }
        for (int x:ans)pw.print(x+" ");
        pw.flush();
    }
    static int max;
    static int start;
    static class SufT{
        static class Node{Node[]nxt= new Node[26];int val=0;int dis=0;};
        Node root= new Node();
        void put(char[]s){
            Node cur = root;
            for (char c:s){
                Node nxt=cur.nxt[c-'a'];
                if (nxt==null){
                    nxt=cur.nxt[c-'a']= new Node();
                    nxt.dis=cur.dis+1;
                }
                cur=nxt;
                cur.val++;
            }
        }
        void search(){
            Queue<Node>q= new LinkedList<>();
            ((LinkedList<Node>) q).add(root);
//            boolean[][]vis= new boolean[26][200];
            while (!q.isEmpty()) {
                Node x = q.poll();
                for (int i =0;i<26;i++){
                    Node nxt=x.nxt[i];
                    if (nxt!=null){
                        ((LinkedList<Node>) q).add(nxt);
//                        vis[i][nxt.dis]=true;
                    }
                }
                if (x.val>=3){
                    max=x.val;
                    start=Math.max(start,x.dis);
                }
            }
        }
    }

    static long modPow(long a ,int e ,int mod){
        a%=mod;
        long res=1;
        while (e>0){
            if ((e%2)==1){
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            e>>=1;
        }
        return res%mod;
    }
    static class Scanner{
        StringTokenizer st;
        BufferedReader br;
        public  Scanner(InputStream s){
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException{
            while (st==null||!st.hasMoreTokens())st= new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        public String nextLine() throws IOException {return br.readLine();};
        public int nextInt() throws IOException {return Integer.parseInt(next());}
        public long nextLong() throws IOException {return Long.parseLong(next());}

    }
}
