import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int[]x=new int[n];
        for(int i=0;i<n;++i){
            x[i]=sc.nextInt()-1;
        }
        //i+1 appears exactly i times in [0,x[i])
        long[]taplis=new long[n];
        for(int i=0;i<n;++i){
            taplis[i]=(long)x[i]<<32|i;
        }
        Arrays.sort(taplis);
        int pack=0;
        int acte=0;
        int[]ans=new int[n*n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;++i){
            int a=(int)taplis[i];
            int y=(int)(taplis[i]>>>32);
            if(pack+a>y){
                out.println("No");
                out.close();
                return;
            }
            pack+=a+1;
            int cnt=0;
            while(cnt<a){
                if(ans[acte]==-1){
                    ans[acte++]=a+1;
                    cnt++;
                }else{
                    acte++;
                }
            }
            ans[y]=a+1;
        }
        acte=n*n-1;
        for(int i=n-1;i>=0;--i){
            for(int j=0;j<n-1-i;++j){
                while(ans[acte]!=-1)acte--;
                ans[acte]=i+1;
            }
        }
        int[]cnt=new int[n];
        for(int i=0;i<n*n;++i){
            int b=ans[i]-1;
            cnt[b]++;
            if(cnt[b]==b+1&&i!=x[b]){
                out.println("No");
                out.close();
                return;
            }
        }
        out.println("Yes");
        for(int i=0;i<n*n;++i)
            out.print(ans[i]+(i==n*n-1?"\n":" "));
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
