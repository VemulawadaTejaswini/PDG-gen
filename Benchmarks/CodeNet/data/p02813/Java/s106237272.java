/*Author: Satyajeet Singh, Delhi Technological University*/
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static long factorial[],invFactorial[];
    static ArrayList<Integer> graph[];
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    public static int[] swap(int data[], int left, int right) 
    { 
  
        // Swap the data 
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to reverse the sub-array 
    // starting from left to the right 
    // both inclusive 
    public static int[] reverse(int data[], int left, int right) 
    { 
  
        // Reverse the sub-array 
        while (left < right) { 
            int temp = data[left]; 
            data[left++] = data[right]; 
            data[right--] = temp; 
        } 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to find the next permutation 
    // of the given integer array 
    public static boolean findNextPermutation(int data[]) 
    { 
  
        // If the given dataset is empty 
        // or contains only one element 
        // next_permutation is not possible 
        if (data.length <= 1) 
            return false; 
  
        int last = data.length - 2; 
  
        // find the longest non-increasing suffix 
        // and find the pivot 
        while (last >= 0) { 
            if (data[last] < data[last + 1]) { 
                break; 
            } 
            last--; 
        } 
  
        // If there is no increasing pair 
        // there is no higher order permutation 
        if (last < 0) 
            return false; 
  
        int nextGreater = data.length - 1; 
  
        // Find the rightmost successor to the pivot 
        for (int i = data.length - 1; i > last; i--) { 
            if (data[i] > data[last]) { 
                nextGreater = i; 
                break; 
            } 
        } 
  
        // Swap the successor and the pivot 
        data = swap(data, nextGreater, last); 
  
        // Reverse the suffix 
        data = reverse(data, last + 1, data.length - 1); 
  
        // Return true as the next_permutation is done 
        return true; 
    } 
    public static void main(String args[]) throws Exception{
        nl();
        int n=pi();
        nl();
        int input[]=new int[n];
        for(int i=0;i<n;i++){
            input[i]=i+1;
        }
        int A[]=new int[n];
        int B[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=pi();
        }
        nl();
        for(int i=0;i<n;i++){
            B[i]=pi();
        }
        int a=-1;
        int b=-1;
        int c=1;
        while(true){
            if(a==-1){
                boolean f=true;
                for(int i=0;i<n;i++){
                    if(input[i]!=A[i]){
                        f=false;
                        break;
                    }
                }
                if(f)a=c;
            }
            if(b==-1){
                boolean f=true;
                for(int i=0;i<n;i++){
                    if(input[i]!=B[i]){
                        f=false;
                        break;
                    }
                }
                if(f)b=c;
            }
            c++;
            if(!(findNextPermutation(input)&&(a==-1||b==-1)))break;
        }
        out.println(Math.abs(a-b));
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
    }
    static int pi(){
        return Integer.parseInt(st[pptr++]);
    }
    static long pl(){
        return Long.parseLong(st[pptr++]);
    }
    static double pd(){
        return Double.parseDouble(st[pptr++]);
    }
    static String ps(){
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000"); 
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(long mask){
        int ans=0;
        while(mask!=0){
            mask&=(mask-1);
            ans++;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
/*********************************************PAIR********************************************************/
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int index=-1;
        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
        public int compareTo(Pair other) {
            if(index!=other.index)
                return Long.compare(index, other.index);
            return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*******************************************************/
    static class Pairl implements Comparable<Pairl> {
            long u;
            long v;
            int index=-1;
            public Pairl(long u, long v) {
                this.u = u;
                this.v = v;
            }
            public int hashCode() {
                int hu = (int) (u ^ (u >>> 32));
                int hv = (int) (v ^ (v >>> 32));
                return 31 * hu + hv;
            }
            public boolean equals(Object o) {
                Pairl other = (Pairl) o;
                return u == other.u && v == other.v;
            }
            public int compareTo(Pairl other) {
                if(index!=other.index)
                    return Long.compare(index, other.index);
                return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
            }
            public String toString() {
                return "[u=" + u + ", v=" + v + "]";
            }
        }
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c){
        long x=1;
        long y=a%c;
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y*y)%c; // squaring the base
            b /= 2;
        }
        return  x%c;
    }
/********************************************GCD**********************************************************/
    static long gcd(long x, long y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
/******************************************SIEVE**********************************************************/
    static void sieveMake(int n){
        sieve=new boolean[n];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i*i<n;i++){
            if(sieve[i]){
                for(int j=i*i;j<n;j+=i){
                    sieve[j]=false;
                }
            }
        }
        primes=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(sieve[i]){
                primes.add(i);
            }
        }        
    }
/********************************************End***********************************************************/
}