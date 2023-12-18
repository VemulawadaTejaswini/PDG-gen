//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main{
    static int ans;
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int n=scan.nextInt();
        boolean[] temp=new boolean[n];
        P[] arr=new P[n];
        for(int i=0;i<n;i++){
            arr[i]=new P(n);
            int ai=scan.nextInt();
            Map<Integer,Boolean> cur=arr[i].m;
            for(int j=0;j<ai;j++){
                int x=scan.nextInt();
                int y=scan.nextInt();
                if(y==0){
                    cur.put(x-1,false);
                }else{
                    cur.put(x-1,true);
                }
            }
        }
        ans=0;
        bruteForce(0,n,temp,arr);
        System.out.println(ans);
    }
    static void bruteForce(int i,int n,boolean[] cur,P[] arr){
        if(i==n){
            int flag=0;
            int val=0;
            for(int j=0;j<n;j++){
                if(cur[j]){
                    val++;
                    Map<Integer,Boolean> c=arr[j].m;
                    for(Integer k:c.keySet()){
                        boolean v=c.get(k);
                        if(cur[k]!=v){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1){
                        break;
                    }
                }
            }
            if(flag==0){
                ans=Math.max(ans,val);
            }
            return;
        }
        bruteForce(i+1,n,cur,arr);
        cur[i]=true;
        bruteForce(i+1,n,cur,arr);
        cur[i]=false;
    }
    static class P{
        int a;
        Map<Integer,Boolean> m;
        P(int a){
            this.a=a;
            m=new HashMap<>();
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
