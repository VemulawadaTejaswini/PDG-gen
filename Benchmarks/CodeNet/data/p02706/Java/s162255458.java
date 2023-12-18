import java.util.*;
import java.io.*;
 
//294784RY
 
public class Main {
    public static PrintStream out = new PrintStream(System.out);
    static LinkedList<Integer> adj[];
    static boolean[] vis;
    static final int nINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(); 
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum = 0;
        for(int i = 0; i < m ; i++){
            sum += sc.nextInt();
        }
        if(sum > n) out.println(-1);
        else if(sum == n) out.println(0);
        else out.println(n - sum);

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
    
     static long fastPower(long x, int y) {
        long result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;
    }
     
    static ArrayList<Integer> moveToFront(ArrayList<Integer> list, int num){
        //int item = list.indexOf(num);
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
    static int getUpper(int[] arr, int target)  
    {  
        int start = 0, end = arr.length - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr[mid] <= target) {  
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
    static int getLower(int[] arr, int target)  
    {  
        int start = 0, end = arr.length-1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to the left side if the target is smaller  
            if (arr[mid] >= target) {  
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
 
    private static long pow(int base,int exp){
            if(exp == 0){
                    return 1;
            }else if(exp == 1){
                    return base;
            }else{
                    long a = pow(base,exp/2);
                    if(exp%2 == 0){
                            return a * a;
                    }else{
                            return a * a * base;
                    }
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
    public int id;
    public int parent;
    public ArrayList<Node> children;
    public Node(int v, int p)
    {
        this.id=v;
        this.parent=p;
        children = new ArrayList();
    }
}

class Pair implements Comparable<Pair>{
    int first;
    int second;
    public Pair(int a, int b){
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
 

//class DSolver{
//    int[][] grid;
//    int Colors;
//    int Rows;
//    int Columns;
//    long Combinations;
//    
//    void begin(){
//        FastScanner sc = new FastScanner();
//        Combinations = 0;
//        Columns = 3;
//        Colors = 3;
//        Rows = sc.nextInt();
//        grid = new int[Rows][Columns];
//        
//        solve(0, 0);
//        
//    }
//    
//    void solve(int r, int c){
//        for(int i = 1; i <= Colors; i++){
//            if(valid(r,c,i)){
//                grid[r][c] = i;
//                if(r == Rows - 1 && c == Columns - 1)
//                    Combinations++;
//                else if(r == Rows - 1) solve(0, c + 1);
//                else solve(r + 1, c);
//            }
//        }
//        grid[r][c] = 0;
//    }
//    
//    boolean valid(int r, int c, int n){
//        return(leftOK(r, c, n) && rightOK(r, c, n) &&  topOK(r, c, n) &&  bottomOK(r, c, n));
//    }
//    
//    boolean leftOK(int r, int c, int n){
//        if(c == 0) return true;
//        if(grid[r][c - 1] != n) return true;
//        return false;
//    }
//    
//    boolean rightOK(int r, int c, int n){
//        if(r == 0) return true;
//        if(grid[r - 1][c] != n) return true;
//        return false;        
//    }
//    
//    boolean topOK(int r, int c, int n)
//    {
//        if(r == 0) return true;
//        if(grid[r - 1][c] != n) return true;
//        return false;
//    }
//
//    boolean bottomOK(int r, int c, int n)
//    {
//        if(r == Rows - 1) return true;
//        if(grid[r + 1][c] != n) return true;
//        return false;
//    }    
//    
//}
// 
 
//    private static ArrayList<Integer> primeSieve(int n){
//        boolean b[] = new boolean[n+1];
//        b[0] = true;
//        b[1] = true;
//        for(int i=2;i<=5;i++){
//                int j = 2;
//                while(i * j <= n && !b[i]){
//                        b[i * j] = true;
//                        j++;
//                }
//        }
// 
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=2;i<n+1;i++){
//                if(!b[i]){
//                        arr.add(i);
//                }
//        }
// 
//        return arr;
//    }   
 
 





// for atcoder 163 F
//        int n = sc.nextInt();
//        Pair[] arr = new Pair[n];
//        for(int i = 0; i < n; i++){
//            Pair a = new Pair(sc.nextInt(), i);
//            arr[i] = a;
//        }
//        Arrays.sort(arr);
//        long sum = 0;
//        int sel = 0;
//        HashMap<Integer, Integer> map = new HashMap();
//
//        for(int i = n - 1; i >= 0; i--){
//
//            if(sel == n / 2)
//                break;
//            if(n == i - 1){
//                map.put(arr[i].second, 1);
//                sum += arr[i].first;
//                sel++;
//                continue;
//            }
//            if(map.containsKey(arr[i].second - 1) || map.containsKey(arr[i].second + 1)){
//                continue;
//            }
//            map.put(arr[i].second, 1);
//            sum += arr[i].first;
//            sel++;
//        }
//        out.println(sum);
