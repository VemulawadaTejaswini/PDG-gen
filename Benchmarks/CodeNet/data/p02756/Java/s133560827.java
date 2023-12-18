import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        StringBuilder str = new StringBuilder(obj.next());
        int op = obj.nextInt();
        boolean flag = true;
        while(op--!=0)
        {
            int t = obj.nextInt();
            if(t==1)
                flag = !(flag);
            else if(t==2)
            {
                int k = obj.nextInt();
                if(k==1 && flag)
                {
                    char a = obj.next().charAt(0);
                    str = new StringBuilder(a+str.toString());
                }
                else if(k==2 && flag)
                {
                    char a = obj.next().charAt(0);
                    str = new StringBuilder(str.toString()+a);
                }
                else if(k==1 && !flag)
                {
                    char a = obj.next().charAt(0);
                    str = new StringBuilder(str.toString()+a);
                }
                else if(k==2 && !flag)
                {
                    char a = obj.next().charAt(0);
                    str = new StringBuilder(a+str.toString());
                }
            }
        }
        System.out.println((flag)?str.toString():str.reverse().toString());
    }
}
