/*import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
static long[] f;
static long mod=(long)1e9+7;
//......................................@uthor_Alx..............................................

   public static void main(String[] args) throws  IOException{
				assign();
				int t=1;//int_v(read()),cn=1;
				while(t--!=0){
					int n=int_v(read());
					char[] c=read().toCharArray();
					int i=0,j=c.length-1,res=0;
					while(i<j){
						while(i<c[i]=='R'){i++;}
						while(c[i]=='W'){j--;}
						if(i<j){
							res++;
							c[i]='R';c[j]='W';
							i++;j--;
						}
					}
					out.write(res+"");
				}
			    
			    out.flush();

	}
}
*/
//package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static class Query {
        int l, r, result = 0;

        public Query(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    private static int[] segmentSum, segmentMin, diff;
    private static int prevDiff = 0, prevE = 0, parent, now;

    private static void update(int i, int l, int r, int idx, int value) { // 1 based
        if (l == r) {
            segmentSum[i] += value;
            if (value == -1) { // reset previous repeated sum addition
                prevDiff = diff[i];
                prevE = segmentMin[i];
                segmentMin[i] = Integer.MAX_VALUE; // reset previous repeated values
            } else {
                if (parent == 0) diff[i] = 0;
                else diff[i] = now - parent;

                if (prevDiff == 0 || prevDiff == now - parent) segmentMin[i] = prevE;
                else segmentMin[i] = parent - prevDiff + 1;
            }

        } else {
            int m = (l + r) >>> 1;
            if (idx <= m) update(i << 1, l, m, idx, value);
            else update(i << 1 | 1, m + 1, r, idx, value);

            segmentSum[i] = segmentSum[i << 1] + segmentSum[i << 1 | 1];
            segmentMin[i] = Math.min(segmentMin[i << 1], segmentMin[i << 1 | 1]);
        }
    }

    private static int findSum(int i, int l, int r, int idx) { // [idx, n]
        if (l == r) {
            return segmentSum[i];
        } else {
            int m = (l + r) >>> 1;
            if (idx <= m) return findSum(i << 1, l, m, idx) + segmentSum[i << 1 | 1];
            else return findSum(i << 1 | 1, m + 1, r, idx);
        }
    }

    private static int findMin(int i, int l, int r, int idx) { // [idx, n]
        if (l == r) {
            return segmentMin[i];
        } else {
            int m = (l + r) >>> 1;
            if (idx <= m) return Math.min(findMin(i << 1, l, m, idx), segmentMin[i << 1 | 1]);
            else return findMin(i << 1 | 1, m + 1, r, idx);
        }
    }

    public static void main(String[] args) throws Exception {
        final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q= Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        ArrayList<Integer>[] rBuckets = new ArrayList[n + 1];

        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            rBuckets[i] = new ArrayList<Integer>();
        }


        Query[] queries = new Query[q];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(bf.readLine());
            int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
            queries[i] = new Query(l, r);
            rBuckets[r].add(i);
        }

        int[] lastIdx = new int[100001];
        segmentSum = new int[4 * n];
        segmentMin = new int[4 * n];
        Arrays.fill(segmentMin, Integer.MAX_VALUE);
        diff = new int[4 * n];

        for (int i = 1; i <= n; i++) {
            parent = lastIdx[arr[i]];
            now = i;
            prevDiff = 0;
            prevE = 0;

            if (parent == 0) {
                update(1, 1, n, i, 1);
            } else {
                update(1, 1, n, parent, -1); // reset previous occurrence of arr[i]
                update(1, 1, n, i, 1); // push 1 to latest seen
            }

            lastIdx[arr[i]] = i;

            for (int j : rBuckets[i]) { // for queries with r == i
                queries[j].result = findSum(1, 1, n, queries[j].l);
                if (findMin(1, 1, n, queries[j].l) > queries[j].l) queries[j].result++; // problem child
            }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(queries[i].result);
        }
    }
}

	       

	       
