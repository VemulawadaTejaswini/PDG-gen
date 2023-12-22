import java.io.*;
import java.io.IOException;

import java.util.*;
//import javafx.util.Pair; 
//import java.util.concurrent.LinkedBlockingDeque;

//import sun.net.www.content.audio.wav;

//import sun.net.www.content.audio.wav;



    
  class Main {
        
        public static long mod = (long)Math.pow(10, 9)+7 ;
        public static double epsilon=0.00000000008854;//value of epsilon
        public static InputReader sc = new InputReader(System.in);
        public static PrintWriter pw = new PrintWriter(System.out);
        
        public static long gcd(long a,long b){
            while(b>0){
                long t=b;
                b=a%b;
                a=t;
            }
            return a;
        }
        
        public static ArrayList<ArrayList <Integer>> GetGraph(int n,int m){
            ArrayList<ArrayList <Integer>> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(new ArrayList<>());
            }
            for(int i=0;i<m;i++){
                int u=sc.nextInt()-1;
                int v=sc.nextInt()-1;
                a.get(u).add(v);
                a.get(v).add(u);
            } 
            return a;
        }
        public static int countSet(int a){
            int c=0;
            while(a>0){
                a&=(a-1);
                c++;
            }
            return c;
        }
        public static int fun(int n){
            if(n==0)
            return 0;
            else return 1+fun(n%(countSet(n)));


        }
        public static int check(int a[][],int i,int j){
            int t=4;
            if(i-1<0)
            t--;
            if(j-1<0)
            t--;
            if(j+1>=a[0].length)
            t--;
            if(i+1>=a.length)
            t--;
            return t;

        }
        public static int [] nextGreaterElementIndexR(int a[]){///left to right
            int n=a.length;
            Stack<Integer> st=new Stack<>();
            int ans[]=new int [n];
            Arrays.fill(ans, n);
            st.push(0);
            for(int i=1;i<n;i++){
                while(!st.empty()&&a[st.peek()]>a[i]){
                    int in=st.pop();
                    ans[in]=i;
                }
                st.push(i);
            }
            return ans;
        }
        public static int[] nextSmallerElementIndexL(int a[]){//right to left
            int n=a.length;
            Stack<Integer> st=new Stack<>();
            int ans[]=new int [n];
            Arrays.fill(ans, -1);
            st.push(n-1);
            for(int i=n-2;i>=0;i--){
                while(!st.empty()&&a[st.peek()]>a[i]){
                    int in=st.pop();
                    ans[in]=i;
                }
                st.push(i);
            }
            return ans;
        }
        public static long pow(long x,long y,long mod){
            long ans=1;
            
            x%=mod;
            while(y>0){
                if((y&1)==1){
                    ans=(ans*x)%mod;
                }
                y=y>>1;
                x=(x*x)%mod;
            }
            return ans;
        }

        public static void main(String[] args) {
            // code starts..
            
                int q=sc.nextInt();
                while(q-->0){
                    int n=sc.nextInt();
                    Integer a[][]=new Integer[n][4];
                    for(int i=0;i<n;i++){
                        a[i][0]=sc.nextInt();
                        a[i][1]=sc.nextInt();
                        a[i][2]=sc.nextInt();
                        a[i][3]=a[i][2]-a[i][1];
                    }
                    Arrays.sort(a,column(3));

                    int l=0,r=n-1;
                    Bit pre=new Bit(n+5);
                    TreeSet<Integer> tr1=new TreeSet<>();
                    for(int i=0;i<n;i++){
                        tr1.add(i+1);
                    }
                    int ans[]=new int[n];
                    while(l<=r){
                        if(-a[l][3]>=a[r][3]){
                            Integer in=tr1.floor(a[l][0]);
                            if(in!=null){
                                ans[in-1]=a[l][1];
                                tr1.remove(in);
                            }
                            else{
                                in=tr1.ceiling(a[l][0]);
                                ans[in-1]=a[l][2];
                                tr1.remove(in);
                            }
                            l++;
                        }
                        else{
                            Integer in=tr1.ceiling(a[r][0]+1);
                            if(in!=null){
                                ans[in-1]=a[r][2];
                                tr1.remove(in);
                            }
                            else{
                                in=tr1.floor(a[r][0]);
                                ans[in-1]=a[r][1];
                                tr1.remove(in);
                            }
                            r--;
                        }
                    }
                    long s=0;
                    //pw.println(Arrays.toString(ans));
                    for(int i=0;i<n;i++){
                        s+=ans[i];
                    }
                    pw.println(s);
                     
                }
                
            


                
            
            // Code ends...
            pw.flush();
            pw.close();
        }
       
        public static Comparator<Integer[]> column(int i){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
                }
            };
        }
        public static Comparator<Integer[]> pair(){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    int result=o1[0].compareTo(o2[0]);
                    if(result==0)
                    result=o1[1].compareTo(o2[1]);
                    return result;
                }
            };
        }
        public static String reverseString(String s){
            StringBuilder input1 = new StringBuilder(); 
            input1.append(s);  
            input1 = input1.reverse();
            return input1.toString();
        }
        public static int[] scanArray(int n){
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    
            return a;
        }
        public static long[] scanLongArray(int n){
            long a[]=new long [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
    
            return a;
        }
        public static String [] scanStrings(int n){
            String a[]=new String [n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLine();
    
            return a;
        }
        
    }
    
    class InputReader {
    
            private final InputStream stream;
            private final byte[] buf = new byte[8192];
            private int curChar, snumChars;
            private SpaceCharFilter filter;
    
            public InputReader(InputStream stream) {
                this.stream = stream;
            }
    
            public int snext() {
                if (snumChars == -1)
                    throw new InputMismatchException();
                if (curChar >= snumChars) {
                    curChar = 0;
                    try {
                        snumChars = stream.read(buf);
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                    if (snumChars <= 0)
                        return -1;
                }
                return buf[curChar++];
            }
    
            public int nextInt() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                int res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public long nextLong() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = snext();
                }
                long res = 0;
                do {
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
            }
    
            public int[] nextIntArray(int n) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = nextInt();
                }
                return a;
            }
    
            public String readString() {
                int c = snext();
                while (isSpaceChar(c)) {
                    c = snext();
                }
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isSpaceChar(c));
                return res.toString();
            }
    
            public String nextLine() {
                int c = snext();
                while (isSpaceChar(c))
                    c = snext();
                StringBuilder res = new StringBuilder();
                do {
                    res.appendCodePoint(c);
                    c = snext();
                } while (!isEndOfLine(c));
                return res.toString();
            }
    
            public boolean isSpaceChar(int c) {
                if (filter != null)
                    return filter.isSpaceChar(c);
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
            }
    
            private boolean isEndOfLine(int c) {
                return c == '\n' || c == '\r' || c == -1;
            }
    
            public interface SpaceCharFilter {
                public boolean isSpaceChar(int ch);
            }
        }
        class Bit{//1...n
            int a[];
            Bit(int n){
                a=new int[n+1];
            }
            void update(int i,int delta){
                while(i<a.length){
                    a[i]+=delta;
                    i+=i&(-i);
                }
            }
            int query(int i){
                int sum=0;
                while(i>0){
                    sum+=a[i];
                    i-=i&(-i);
                }
                return sum;
            }
        }
        
        