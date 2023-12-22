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
            long n=scan.nextInt();
            long q=scan.nextInt();
            int[] arr=new int[(int)n];
            for(int i=0;i<n;i++){
                arr[i]=(int)n-1;
            }
            segTree rm=new segTree(arr);
            segTree dm=new segTree(arr);
            long bs=(n-2)*(n-2);
            for(int i=0;i<q;i++){
                int type=scan.nextInt();
                int x=scan.nextInt();
                if(type==1){
                    long can=dm.query(x-1,(int)n-1);
                    bs-=can-1;
                    rm.update((int)can-1,x-1);
                }
                if(type==2){
                    long can=rm.query(x-1,(int)n-1);
                    bs-=can-1;
                    dm.update((int)can-1,x-1);
                }
            }
            out.println(bs);
        }
        out.flush();
        out.close();
    }
        static class segTree{
                snode[] arr;
                int n;
                segTree(int[] ar){
                    int x=(int)(Math.ceil(Math.log(ar.length)/Math.log(2)));
                    int n=2*(int)Math.pow(2,x)-1;
                    this.arr=new snode[n];
                    for(int i=0;i<n;i++){
                        arr[i]=new snode();
                    }
                    this.n=ar.length-1;
                    construct(0,ar.length-1,ar,0);
                }
                void construct(int l,int r,int[] ar,int pos){
                    if(l==r){
                        arr[pos].x=ar[l];
                        return;
                    }
                    int mid=(l+r)/2;
                    int li=2*pos+1;
                    int ri=2*pos+2;
                    construct(l,mid,ar,2*pos+1);
                    construct(mid+1,r,ar,2*pos+2);
                    snode ll=arr[li];
                    snode rr=arr[ri];
                    arr[pos].x=Math.min(ll.x,rr.x);
                }
                void update(int i,int nv){
                    update(0,n,i,nv,0);
                }
                void update(int l,int r,int i,int nv,int pos){
                    if(i==l&&i==r){
                        arr[pos].x=Math.min(arr[pos].x,nv);
                        return;
                    }
                    if(i<l||i>r){
                        return;
                    }
                    int mid=(l+r)/2;
                    update(l,mid,i,nv,2*pos+1);
                    update(mid+1,r,i,nv,2*pos+2);
                    int li=2*pos+1;
                    int ri=2*pos+2;
                    snode ll=arr[li];
                    snode rr=arr[ri];
                    arr[pos].x=Math.min(ll.x,rr.x);
                }
                long query(int i,int j){
                    return query(0,n,i,j,0).x;
                }
                snode query(int l,int r,int i,int j,int pos){
                    snode ret=new snode();
                    if(i>r||j<l){
                        return null;
                    }
                    if(i<=l&&j>=r){
                        ret.x=arr[pos].x;
                        return ret;
                    }
                    int mid=(l+r)/2;
                    snode ll=query(l,mid,i,j,2*pos+1);
                    snode rr=query(mid+1,r,i,j,2*pos+2);
                    if(ll==null){
                        return rr;
                    }
                    if(rr==null){
                        return ll;
                    }
                    ret.x=Math.min(rr.x,ll.x);
                    return ret;
                }

            }
            static class snode{
                long x=0;

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
