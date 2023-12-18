import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int qd[][];
    static int q;
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        n=sc.nextInt();m=sc.nextInt();q=sc.nextInt();
        a=new int[n];
        qd=new int[q][4];
        for (int i=0;i<q;i++){
            for (int j=0;j<4;j++){
                qd[i][j]=sc.nextInt();
            }
            qd[i][0]--;
            qd[i][1]--;
        }
        per(0,1);
        System.out.println(ans);
    }
    static int sum(){
        int sum=0;
        for (int i=0;i<q;i++){
            if (qd[i][0]<n && qd[i][1]<n && a[qd[i][1]]-a[qd[i][0]]==qd[i][2]){
                sum+=qd[i][3];
            }
        }
        return sum;
    }
    static int a[];
    static int m;
    static int n;
    static int ans=0;
    static void per(int i,int k) {
        if (i==n){
            ans=Math.max(ans,sum());
            return;
        }
        for (int j=k;j<=m;j++){
            a[i]=j;
            per(i+1,j);
        }
    }
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
}