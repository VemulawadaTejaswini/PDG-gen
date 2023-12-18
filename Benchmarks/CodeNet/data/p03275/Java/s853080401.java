import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        n=Integer.parseInt(f.readLine());
        arr=new int[n];
        brr=new int[n];
        StringTokenizer st=new StringTokenizer(f.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        	brr[i]=arr[i];
        }
        Arrays.sort(brr);
        long lo = 0;
        long hi = n-1;
        while (hi > lo+1) {
            long mid = (lo + hi) / 2;
            if (doable(brr[mid])) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        System.out.print(brr[lo]);
        f.close();
        out.close();
    }

    static int[]arr;
    static int n;
    static boolean doable(long cur){
        //nums such that greater
        BIT=new int[250000];
        int[]temp=new int[n];
        int[]pfx=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i]>=cur?1:-1;
            pfx[i]=i==0?temp[i]:pfx[i-1]+temp[i];
//            update(i,pfx[i],120000);

        }
        long inv=0;
        //count inversions
        //more 1's than -1 if prefix condition is satisfied
        update(0,1,220000);
        for(int i=0;i<n;i++){
            inv+=query(pfx[i]);
            update(pfx[i],1,220000);
        }
        return inv>=(n*(n+1)/4)+1;
    }
    static int[]BIT;
    //add val at index x
    //declare n very large
    static void update(int x, long val,int n)
    {
        x+=100005;
        for(; x <= n; x += x&-x)
            BIT[x] += val;
    }
    static long query(int x)
    {
        x+=100005;
        long sum = 0;
        for(; x > 0; x -= x&-x)
            sum += BIT[x];
        return sum;
    }
}
class pair implements Comparable <pair>{
    int num;
    int idx;

    public int compareTo(pair other){
        return num- other.num;
    }


    pair(int a, int b)
    {
        num=a;
        idx=b;
    }
}
