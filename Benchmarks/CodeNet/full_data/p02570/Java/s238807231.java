import java.io.*;
import java.io.IOException;
import java.util.*;


//import javafx.util.Pair; 
//import java.util.concurrent.LinkedBlockingDeque;







    
  class Main {
     
        
        public static long mod = (long)Math.pow(10,9)+7 ;
        public static double epsilon=0.00000000008854;//value of epsilon
        public static InputReader sc = new InputReader(System.in);
        public static PrintWriter pw = new PrintWriter(System.out);
        
        // fun(n,sum)=fun(n-1,sum)+fun(n-1,sum-n^x);
        
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
           int d=sc.nextInt();
           int t=sc.nextInt();
           int s=sc.nextInt();
           if(s*t>=d){
               pw.println("Yes");
           }
           else{
            pw.println("No");
           }

            // Code ends...
            pw.flush();
            pw.close();
        }
       
        public static Comparator<Long[]> column(int i){
            return 
            new Comparator<Long[]>() {
                @Override
                public int compare(Long[] o1, Long[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
                }
            };
        }
        public static Comparator<Integer[]> col(int i){
            return 
            new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[i].compareTo(o2[i]);//for ascending
                    //return o2[i].compareTo(o1[i]);//for descending
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
        public static class InputReader {
    
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
        
    }
    
    
    
        
    