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
static int arr[];
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        int a=in.nextInt(),b=in.nextInt();
        arr=new int[n+1];
        if(a==1 && a+1==b){
            System.out.println("Borys");
            return;
        }
        if(b==n && b-1==a){
            System.out.println("Alice");
            return;
        }
        for (int i = 1; i <=2*n; i++) {
            if(i%2==0){
                if(b==n && b-1==a){
                    System.out.println("Alice");
                    return;
                }
                if(!dfs(a,b-1,n)){
                    if(!dfs(a,b+1,n)){
                        System.out.println("Alice");
                        return;
                    }else{
                        b++;
                    }
                }else{
                    b--;
                }
            }else{
                if(a==1 && a+1==b){
                    System.out.println("Borys");
                    return;
                }
                if(!dfs(a+1,b,n)){
                    if(!dfs(a-1,b,n)){
                        System.out.println("Borys");
                        return;
                    }
                    else {
                        a--;
                    }
                }else{
                    a++;
                }
            }
        }
        System.out.println("Draw");

    }

    private static boolean dfs(int a ,int b,int n) {
        if(a==n+1 || a==b) {
            return false;
        }
        if(b==0 || b==a ){
            return false;
        }
        return true;
    }
}




