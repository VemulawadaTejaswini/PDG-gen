//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[] p=new int[n];
            for(int i=0;i<n;i++){
                p[i]=scan.nextInt()-1;
            }
            long[] c=new long[n];
            for(int i=0;i<n;i++){
                c[i]=scan.nextInt();
            }
            long ans=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long temp=c[p[i]];
                long max=c[p[i]];
                long[] pr=new long[n];
                Map<Integer,Integer> m=new HashMap<>();
                pr[0]=c[p[i]];
                m.put(i,0);
                int j=1;
                int in=p[i];
                int kt=k-1;
                Set<Integer> vis=new HashSet<>();
                vis.add(i);
                int cin=-1;
                while(kt>0){
                    kt--;
                    int nxt=p[in];
                    temp+=c[nxt];
                    max=Math.max(temp,max);
                    pr[j]=c[nxt];
                    j++;
                    in=nxt;
                    if(vis.contains(nxt)){
                        cin=m.get(nxt);
                        break;
                    }
                    vis.add(in);
                    m.put(in,j);
                }
                if(kt==0){
                    ans=Math.max(ans,max);
                }else{
                    int mxin=cin;
                    long mx=pr[cin];
                    for(int l=cin+1;l<j;l++){
                        pr[l]+=pr[l-1];
                        if(pr[l]>mx){
                            mx=pr[l];
                            mxin=l;
                        }
                    }
                    long cl=j-cin;
                    long pcs=kt/cl;
                    long val=pr[j-1];
                    if(kt>=mxin-cin){
                        max=Math.max(max,temp+mx);
                    }
                    if(val>0){
                        long fi=temp+pcs*val;
                        kt-=pcs*cl;
                        if(kt>0){
                            long x=Long.MIN_VALUE;
                            for(int l=cin;l<cin+kt;l++){
                                x=Math.max(x,pr[l]);
                            }
                            fi+=x;
                        }
                        max=Math.max(max,fi);
                        long se=temp;
                        if(pcs>0){
                            se+=(pcs-1)*val+mx;
                        }
                        max=Math.max(se,max);
                    }
                    ans=Math.max(ans,max);
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) {
            in = is;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}
