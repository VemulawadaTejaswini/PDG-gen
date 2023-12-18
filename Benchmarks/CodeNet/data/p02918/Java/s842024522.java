//package com.company;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
    public static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        public FastReader(InputStream stream) {
            this.stream = stream;
        }
        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
        public String nextLine() {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();
            while(isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public char nextChar() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            return (char)c;
        }
        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
            return res.toString();
        }
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    static long gcd(long a, long b){ 
        if (a == 0) 
            return b;  
        return gcd(b % a, a);  
    } 
    static long lcm(long a, long b)  {
        return (a*b)/gcd(a, b);  
    } 
    static long func(long a[],long size,int s){
        long max1=a[s];
        long maxc=a[s];
        for(int i=s+1;i<size;i++){
            maxc=Math.max(a[i],maxc+a[i]);
            max1=Math.max(maxc,max1);
        }
        return max1;
    }
    public static void main(String args[]){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter w = new PrintWriter(outputStream);
      int i,j,n,k,l=0,r=0,c=1;
      n=in.nextInt();
      k=in.nextInt();
      String s=in.next();
      char ch[]=s.toCharArray();
      for(i=0;i<n;i++){
        if(ch[i]=='L'){
          l++;
        }else{
          r++;
        }
      }
      int count=0;
      for(i=1;i<n-1;i++){
        if(ch[i]!=ch[i-1]&&ch[i]!=ch[i+1]){
          count++;
          if(k-count>=0){
            ch[i]=ch[i-1];
            k--;
          }
        }
      }
      if(l+k>=n||r+k>=n){
        w.println(n-1);
        w.close();
        return;
      }
      for(i=0;i<n-1;i++){
        if(ch[i]==ch[i+1]){
          c++;
        }
        
          
      }
      if(n>1){
        if(ch[0]=='L'&&ch[0]==ch[1]){
          c--;
        }if(ch[n-1]=='R'&&ch[n-2]==ch[n-1]){
          c--;
        }
      }
      if(c+k>=n){
        w.println(n-1);
        w.close();
        return;
      }
      w.println(c+k);
      
      
        w.close();
    }
    
}