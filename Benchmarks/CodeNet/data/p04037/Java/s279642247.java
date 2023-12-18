import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;++i)a[i]=sc.nextLong();
        Arrays.sort(a);
        int p=0;
        Map<Long,Integer>hm=new HashMap<Long,Integer>();
        for(int i=0;i<n;++i)
            if(i<=0||a[i]!=a[i-1])hm.put(a[i],p++);
        int[]f=new int[p];
        long[]c=new long[p];
        p=0;
        for(int i=0;i<n;++i)
            if(i<=0||a[i]!=a[i-1])c[p++]=a[i];
        for(int i=0;i<n;++i)f[hm.get(a[i])]++;
        long e=0,o=0;
        for(int i=0;i<p;++i){
            if(c[i]%2==1)e+=f[i];
            else o+=f[i];
        }
        int cons=p;
        for(int i=0;i<p;++i)
            if(c[i]!=i+1){
                cons=i;
                break;
            }
        boolean snd=(e>o&&(e-o)%2==1)||(e<o&&(o-e)%2==0);
        e-=(cons+1)/2;
        o-=cons/2;
        if(cons%2==1){
            long t=e;
            e=o;
            o=t;
        }
        boolean red=(e>o&&(e-o)%2==1)||(e<o&&(o-e)%2==0)||(cons<p&&f[cons]%2==0);
        snd&=cons%2==0?red:!red;
        if(c[0]==1&&f[0]%2==0)
            snd=false;
        out.println(snd?"Second":"First");
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
