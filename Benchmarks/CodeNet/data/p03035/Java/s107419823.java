import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        int A=r.nextInt();
        int B=r.nextInt();
        if(A>=13)
        {
            System.out.println(B);
        }else if(A>=6 && A<=12)
        {
            System.out.println(B/2);
        }
        else
        {
            System.out.println(0);
        }
    }
    public static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader(File s) throws IOException
        {
            br = new BufferedReader(new FileReader(s));
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
    //--------------------------------------------------------
}

