import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
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
    static class pair{
        int a,b,dist;
        pair(int a,int b,int dist){
            this.a=a;
            this.b=b;
            this.dist=dist;
        }
    }
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        int m=in.nextInt();
        pair arr[]=new pair[m];
        for (int i = 0; i <m; i++) {
            int l=in.nextInt(),r=in.nextInt(),dist=in.nextInt();
            if(l>r){
                arr[i]=new pair(r,l,dist);
            }else{
                arr[i]=new pair(l,r,dist);
            }
        }
        Arrays.sort(arr, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                int c=o1.a-o2.a;
                if(c!=0){
                    return c;
                }else{
                    return o1.b-o2.b;
                }
            }
        });
        int ans[]=new int[n+1];
        Arrays.fill(ans,-1);
        ans[1]=1;
        for (int i = 0; i <arr.length; i++) {
            int l=arr[i].a,r=arr[i].b,dist=arr[i].dist;
            int t=ans[l]+dist;
            if(ans[r]!=-1 && ans[r]!=t){
                System.out.println("No");
                return;
            }
            ans[r]=t;

        }
        System.out.println("Yes");
    }
}




