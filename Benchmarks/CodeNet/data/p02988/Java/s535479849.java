import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 public class Main {
    static ArrayList<String> s1;
    static boolean[] prime;
    static int n = (int)1e7;
     static void sieve() {
Arrays.fill(prime	, true);
prime[0] = prime[1] = false;
for(int i = 2 ; i * i <= n ; ++i) {
if(prime[i]) {
for(int k = i * i; k< n ; k+=i) {
prime[k] = false;
}
}
}
 
}
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        
           prime  = new boolean[n + 1];
sieve();
                prime[1] = false;
                
             
           
            int x = sc.ni();
            int []a = sc.nia(x);
            int c = 0;
            for(int i=2;i<x;i++)
            {
                if((a[i-1] <= a[i-2] && a[i-1] > a[i]) || (a[i-1]<=a[i] && a[i-1]>a[i-2]))
                {
                    c++;
                }
            }
            
          w.println(c);
             
             
          
                  
              
              
 
       w.close();
        
    }
    static void bfs(int s)
    {
        vis[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        color[s] = 1;
        level[s] = 0;
        p[s] = s;
        while(q.size()>0)
        {
            int cc = q.poll();
          
            //ArrayList<Integer> te= new ArrayList<>();
            Iterator itr = hs[cc].iterator();
            while(itr.hasNext())
            {
                Integer e = (Integer) itr.next();
                //w.print(e + " ");
                 
                if(!vis[e])
                {
                   
                    q.add(e);
                   // te.add(e);
                    p[e] = cc;
                    if(color[cc]==1)
                        color[e] = 2;
                    else
                        color[e] = 1;
                    level[e] = level[cc]+1;
                    vis[e] = true;
                }
            }
           // w.println();
           
        }
        
    }
    static int []level;
     static int []color;
    static ArrayList<Integer> []hs;
    static boolean []vis;
    static int count = 0;
    static int []p;
  
    //static int [][]arr;
    static boolean [][]v;
    //static int [][]l;
  static boolean con(int []p,int q)
  {
    boolean res = false;
    for(int i=0;i<6;i++)
    {
      if(p[i]==q)
      {
        res = true;
        break;
      }
    }
    return res;
  }
    static String replace(String s,int a,int n)
    {
        char []c = s.toCharArray();
        for(int i=1;i<n;i+=2)
        {
            int num = (int) (c[i] - 48);
            num += a;
            num%=10;
            c[i] = (char) (num+48);
        }
        return new String(c);
    }
    static String move(String s,int h,int n)
    {
        h%=n;
        char []c = s.toCharArray();
        char []temp = new char[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+h)%n] = c[i];
        }
        return new String(temp);
    }
    
     public static int ip(String s){
return Integer.parseInt(s);
}
     static class multipliers implements Comparator<Long>{
  
  public int compare(Long a,Long b) {
   if(a<b)
    return 1;
   else if(b<a)
    return -1;
   else
    return 0;
  }
 }
     static class multipliers1 implements Comparator<Student>{
  
  public int compare(Student a,Student b) {
   if(a.y<b.y)
    return 1;
   else if(b.y<a.y)
    return -1;
   else
   {
       if(a.id < b.id)
           return 1;
       else if(b.id<a.id)
           return -1;
       else
           return 0;
           
    //return 0;
   }
  }
 }
    // Java program to generate power set in 
// lexicographic order. 
 
    
    
    
      static class InputReader {
 
private final InputStream stream;
private final byte[] buf = new byte[8192];
private int curChar, snumChars;
 
public InputReader(InputStream st) {
this.stream = st;
}
 
public int read() {
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
 
public int ni() {
int c = read();
while (isSpaceChar(c)) {
c = read();
}
int sgn = 1;
if (c == '-') {
sgn = -1;
c = read();
}
int res = 0;
do {
res *= 10;
res += c - '0';
c = read();
} while (!isSpaceChar(c));
return res * sgn;
}
 
public long nl() {
int c = read();
while (isSpaceChar(c)) {
c = read();
}
int sgn = 1;
if (c == '-') {
sgn = -1;
c = read();
}
long res = 0;
do {
res *= 10;
res += c - '0';
c = read();
} while (!isSpaceChar(c));
return res * sgn;
}
 
public int[] nia(int n) {
int a[] = new int[n];
for (int i = 0; i < n; i++) {
a[i] = ni();
}
return a;
}
 
public String rs() {
int c = read();
while (isSpaceChar(c)) {
c = read();
}
StringBuilder res = new StringBuilder();
do {
res.appendCodePoint(c);
c = read();
} while (!isSpaceChar(c));
return res.toString();
}
 
public String nextLine() {
int c = read();
while (isSpaceChar(c))
c = read();
StringBuilder res = new StringBuilder();
do {
res.appendCodePoint(c);
c = read();
} while (!isEndOfLine(c));
return res.toString();
}
 
public boolean isSpaceChar(int c) {
return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
}
 
private boolean isEndOfLine(int c) {
return c == '\n' || c == '\r' || c == -1;
}
 
}
 
 
 
 
 
   
static PrintWriter w = new PrintWriter(System.out);
                  static class Student
    {
        int id;
        //int x;
       
        int y;
        //long z;
        
        Student(int id,int y)
        {
            this.id = id;
            //this.x = x;
            //this.s = s;
            this.y = y;
           // this.z = z;
            
            
            
        }
        
    }
}