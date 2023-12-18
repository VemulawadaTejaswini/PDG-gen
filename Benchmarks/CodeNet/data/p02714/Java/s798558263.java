
import java.util.*;
import java.io.*;
import java.math.*;
 
//294784RY
 
public class Main {
    static PrintStream out = new PrintStream(System.out);
    static LinkedList<Integer> adj[];
    static boolean[] vis;
    static final int nINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;
    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();  
        int n = sc.nextInt();
        char[] s = sc.nextLine().toCharArray();
        long[] arr = new long[3];
        for(int i = 0; i < n; i++){
            if(s[i] == 'R') arr[0]++;
            else if(s[i] == 'G') arr[1]++;
            else arr[2]++;
        }
        long ans = arr[0] * arr[1] * arr[2];
        for(int i = 0; i + 2 < n; i++){
            for(int j = i + 1; j + 1 < n; j++){
                int diff = j - i;
                int k = j + diff;
                if(k >= n) continue;
                if(s[i] == s[j] || s[j] == s[k] || s[i] == s[k]) continue;
                ans--;
            }
        }
        out.println(ans);
        
    }
 
            
    static void initAdj(int n){
        adj = new LinkedList[n + 2];
        for(int i = 0; i <= n + 1; i++)
            adj[i] = new LinkedList();
    }    
 
    
    static void dfs(int n){
        Iterator<Integer> i = adj[n].listIterator();
        while(i.hasNext()){
            Integer a = i.next();
            if(!vis[a]){
                vis[a] = true;
                dfs(a);
            }
        }
    }
    
    //start - stop
    static Time timeDiff(Time start, Time stop)
    {
        Time diff = new Time(0, 0, 0);

        if(stop.seconds > start.seconds){
            --start.minutes;
            start.seconds += 60;
        }

        diff.seconds = start.seconds - stop.seconds;
        if(stop.minutes > start.minutes){
            --start.hours;
            start.minutes += 60;
        }

        diff.minutes = start.minutes - stop.minutes;
        diff.hours = start.hours - stop.hours;

        return(diff);
    }
    
    
    static long pow(long a, long b) {
        //a %= mod //for binpowmod
        long res = 1;
        while(b > 0){
            if((b & 1) > 0)
                res = res * a; //add % mod for binpowmod
            a = a * a; //add % mod for binpowmod
            b >>= 1;
        }
        return res;
    }
     
    static ArrayList<Integer> moveToFront(ArrayList<Integer> list, int num){
        int index = list.indexOf(num);
        list.remove(index);
        list.add(0, num);
        return list;
    }
    
    static ArrayList<Integer> sieve(int n){
        boolean prime[] = new boolean[n+1]; 
        ArrayList<Integer> res = new ArrayList();
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                res.add(i);
        }
        return res;
    }
    
    //returns index; outputs earliest occurence; -1 if target value does not exist
    static int getUpper(ArrayList<Pair> arr, int target)  
    {  
        int start = 0, end = arr.size() - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr.get(mid).first <= target) {  
                start = mid + 1;  
            }  
    
            // Move left side.  
            else {  
                ans = mid;  
                end = mid - 1;  
            }  
        }  
        return ans;  
    }  
    
    //returns index; outputs latest occurence; -1 if target value does not exist
    static int getLower(ArrayList<Pair> arr, int target)  
    {  
        int start = 0, end = arr.size() - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to the left side if the target is smaller  
            if (arr.get(mid).first >= target) {  
                end = mid - 1;  
            }  
    
            // Move right side  
            else {  
                ans = mid;  
                start = mid + 1;  
            }  
        }  
        return ans;  
    }  
     
   
 
    static String removeLastChar(String ss) {
        if (ss == null || ss.length() == 0) {
            return ss;
        }
        return ss.substring(0, ss.length()-1);
    }
    
    static String removeByIndex(String str, int index) {
        return new StringBuilder(str).deleteCharAt(index).toString();
    }    
    
    static void solveLunLun(){
        FastScanner sc = new FastScanner();
        Queue<Long> q = new ArrayDeque();
        for(int i = 1; i <= 9; i++){
            q.add((long) i);
        }
        int k = sc.nextInt();
        int cnt = 0;
        long x = 1;
        while(cnt < k){
            x = q.poll();
            cnt++;
            if(cnt >= k) break;
            
            long d = x % (long) 10;
            if(d == 0){
                q.add( (10 * x));
                q.add( (10 * x) + d + 1 );
            }
            else if (d == 9){
                q.add( (10 * x) + d - 1);
                q.add( (10 * x) + d);
            }
            else {
                q.add( (10 * x) + d - 1);
                q.add( (10 * x) + d);
                q.add( (10 * x) + d + 1 );                
            }
        }
        out.println(x);
 
    }
    
    private static long factorial(int n){
            long fac = 1;
            for(int i=2;i<=n;i++){
                    fac *= i;
            }
 
            return fac;
    }
    
    private static boolean isPrime(int n){
            if(n == 0 || n == 1){
                    return false;
            }else if(n%2 == 0){
                    return false;
            }else{
                    int x = (int)(Math.sqrt(n)) + 1;
                    for(int i=3;i<=x;i+=2){
                            if(n % i == 0){
                                    return false;
                            }
                    }
                    return true;
            }
    }
 
    private static int gcd(int a,int b){
            if(a == 0){
                    return b;
            }
 
            return gcd(b%a,a);
    }
 
    private static int lcm(int a,int b){
            return (a * b)/gcd(a,b);
    }
    
 
    
    private static int BSearch(int target, int[] arr){
        int index = -1;
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r){
            int mid = (l + r) / 2;
            if(arr[mid] <= target){
                index = mid;
                l = mid + 1;
            } else{
                r = mid - 1;    
            }
        }
        
        return index;
    }
        
 
}
 
 
class FastScanner { 
    BufferedReader br; 
    StringTokenizer st; 
 
    public FastScanner() 
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
 
    int[] nextIntArray(int length) {
       int[] arr = new int[length];
       for (int i = 0; i < length; i++)
           arr[i] = nextInt();
       return arr;
   }
} 
 
class Node
{
    public int V;
    public Node(int v)
    {
        this.V=v;
    }
}

class Pair implements Comparable<Pair>{
    long first;
    long second;
    public Pair(long a, long b){
        first = a;
        second = b;
    }

    @Override
    public int compareTo(Pair t) {
        if(first < t.first) return -1;
        else if(first == t.first) return 0;
        else return 1;
    }
}
 


class Time{
    int hours;
    int minutes;
    int seconds;
    public Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
}
