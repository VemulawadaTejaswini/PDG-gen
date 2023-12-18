import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Reader r=new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int N=r.nextInt();
        String str=r.next();
        int K=r.nextInt();
        char key=str.charAt(K-1);
        solve(str, key, out);
        out.close();

    }
    static void solve(String str, char key, PrintWriter out)
    {
        String newStr="";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=key)
            {
                newStr+="*";
            }
            else
            {
                newStr+=str.charAt(i);
            }
        }
        System.out.println(newStr);

    }



    //Fast I/O class
    static class Reader
    {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
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
