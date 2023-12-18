import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Main
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    static Exception ex=null;
    public static void main(String args[]) throws Exception
    {
        
        new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    ex=e;
                }
            }
        }, "1", 1 << 26).start();
        if(ex!=null)
            throw ex;
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        char c[]=in.next().toCharArray();
        /*int st=-1, en=-1;
        for(char i='a';i<='z';i++){
            int cnt=0;
            int max=0;
            int min=0;
            int minRem=0;
            for(int j=0;j<c.length;j++){
                if(i==c[j]){
                    cnt++;
                    int nv=2*cnt-j-min-1;
                    if(nv>0&&j!=0){
                        //find answer here
                        en=j;
                        st=j;
                        cnt=1;
                        do{
                            st--;
                            if(c[st]==i)
                                cnt++;
                        }while(2*cnt<=en-st+1);
                        en++;
                        st++;
                        break;
                    }
                    int newMinRem=nv+min;
                    min=Math.min(min, minRem);
                    minRem=newMinRem;
                }
                else{
                    min=Math.min(min, minRem);
                }
                if(st!=-1)
                    break;
            }
            if(st!=-1)
                break;
        }
        out.println(st+" "+en);*/
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                System.out.println((i+1)+" "+(i+2));
                return;
            }
        }
        for(int i=0;i<c.length-2;i++){
            if(c[i]==c[i+2]){
                System.out.println((i+1)+" "+(i+3));
                return;
            }
        }
        System.out.println("-1 -1");
        out.close();
        
    }
}
