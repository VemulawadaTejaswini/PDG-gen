import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
    void run() throws Exception{
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        boolean multiple = false;
        for(int tc = 1, tt = (multiple)?ni(in):1; tc<=tt; tc++)solve(in,out,tc);
        out.flush();
        out.close();
    }
    void solve(FastReader in, PrintWriter out, int TC) throws Exception{
        int n = ni(in), k = ni(in);
        pn(out,(n%k==0)?0:1);
    }
    void p(PrintWriter out, Object o){out.print(o);}
    void pn(PrintWriter out,Object o){out.println(o);}
    int ni(FastReader in){return Integer.parseInt(in.next());}
    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }   
            return str;
        }
    }
} 
