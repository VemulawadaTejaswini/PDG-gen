import java.io.*;
import java.util.*;
public class Main {        
    static int MAX = 1000001; 
    static class Query  
    { 
        int l, r, idx; 
    } 
    static void update(int idx, int val,  
                        int bit[], int n)  
    { 
        for (; idx <= n; idx += idx & -idx) 
            bit[idx] += val; 
    } 
    static int query(int idx, int bit[], int n)  
    { 
        int sum = 0; 
        for (; idx > 0; idx -= idx & -idx) 
            sum += bit[idx]; 
        return sum; 
    } 
  
    static void answeringQueries(int[] arr, int n,  
                                Query[] queries, int q) 
    { 
        int[] bit = new int[n + 1]; 
        Arrays.fill(bit, 0); 
        int[] last_visit = new int[MAX]; 
        Arrays.fill(last_visit, -1); 
        int[] ans = new int[q]; 
        int query_counter = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            if (last_visit[arr[i]] != -1) 
                update(last_visit[arr[i]] + 1, -1, bit, n); 
  
            last_visit[arr[i]] = i; 
            update(i + 1, 1, bit, n); 
  
            while (query_counter < q && queries[query_counter].r == i)  
            { 
                ans[queries[query_counter].idx] =  
                        query(queries[query_counter].r + 1, bit, n) 
                        - query(queries[query_counter].l, bit, n); 
                query_counter++; 
            } 
        } 
        // System.out.println(Arrays.toString(ans));
        for (int i = 0; i < q; i++) 
            System.out.println(ans[i]); 
    } 

    public static void main(String args[]) {
        int n=II();
        int q=II();
        int a[]=IIA(n);
        Query[] queries = new Query[q];
        for (int i = 0; i < q; i++) 
            queries[i] = new Query();
        for(int i=0;i<q;i++){
            queries[i].l=II()-1;
            queries[i].r=II()-1;
            queries[i].idx=i;
        } 
        Arrays.sort(queries, new Comparator<Query>()  
        { 
            public int compare(Query x, Query y) 
            { 
                if (x.r < y.r) 
                    return -1; 
                else if (x.r == y.r) 
                    return 0; 
                else
                    return 1; 
            } 
        }); 
        answeringQueries(a, n, queries, q);
    }
    
    ////////////////////////////////////
    static scan in=new scan(System.in);
    static int II() {
        return in.nextInt();
    }
    static long IL() {
        return in.nextLong();
    }
    static int[] IIA(int n) {
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=II();
        }
        return a;
    }
    static String IS() {
        return in.next();
    }
    static char IC(){
        return in.next().charAt(0);
    }
    static String[] ISA(int n) {
        String a[]=new String[n];
        for(int i=0;i<n;i++) {
            a[i]=IS();
        }
        return a;
    }
    static char[] ICA(int n) {
        char a[]=new char[n];
        for(int i=0;i<n;i++) {
            a[i]=IC();
        }
        return a;
    }
}
class scan
{
    public static BufferedReader reader;
    public static StringTokenizer token;

    scan(InputStream str)
    {
        reader=new BufferedReader(new InputStreamReader(str));
        token=null;
    }

    static int nextInt()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Integer.parseInt(token.nextToken());
    }

    static long nextLong()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Long.parseLong(token.nextToken());
    }

    static String next()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return token.nextToken();
    }

}