import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int w=sc.nextInt();
        int h=sc.nextInt();
        long[]p=new long[w],q=new long[h];
        for(int i=0;i<w;++i)p[i]=sc.nextInt();
        for(int i=0;i<h;++i)q[i]=sc.nextInt();
        long[]taplis=new long[w+h];
        for(int i=0;i<w;++i)taplis[i]=(long)p[i]<<32|i;
        for(int i=0;i<h;++i)taplis[w+i]=(long)q[i]<<32|(w+i);
        Arrays.sort(taplis);
        long ans=0;
        int row=h+1,col=w+1;
        for(long yasuna:taplis){
            long cost=yasuna>>>32;
            int ind=(int)yasuna;
            if(ind>=w){
                ans+=col*cost;
                row--;
            }else{
                ans+=row*cost;
                col--;
            }
        }
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
