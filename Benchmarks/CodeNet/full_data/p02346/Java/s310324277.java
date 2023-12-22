import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.math.BigDecimal;
import java.math.BigInteger;
    
public class Main{
 
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE;
static final long LINF=Long.MAX_VALUE;
 
public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
int n=ir.nextInt();
int q=ir.nextInt();
BIT bit=new BIT(n+1);
while(q-->0){
 int com=ir.nextInt();
 int x=ir.nextInt();
 int y=ir.nextInt();
 if(com==1){
  out.println(bit.segmentsum(x,y+1));
 }
 else{
  bit.update(x,y);
 }
}
out.flush();
}

static class BIT{
 
 private long[] bit;
 private int SIZE;

 public BIT(int n){
  bit=new long[n+1];
  SIZE=n;
 }
//sum of segment[0,i)
 public long sum(int i){
  long res=0;
  while(i>0){
   res+=bit[i];
   i-=i&-i;
  }
  return res;
 }
//sum of segment[start,end)
 public long segmentsum(int start,int end){
  return sum(end)-sum(start);
 }

 public long get(int i){
  return sum(i+1)-sum(i);
 }

 public void update(int i,long x){
  i++;
  while(i<=SIZE){
   bit[i]+=x;
   i+=i&-i;
  }
 }

 public int size(){
  return SIZE;
 }
}

static class InputReader {

 private InputStream in;
 private byte[] buffer=new byte[1024];
 private int curbuf;
 private int lenbuf;
 
 public InputReader(InputStream in) {this.in=in; this.curbuf=this.lenbuf=0;}
  
 public boolean hasNextByte() {
  if(curbuf>=lenbuf){
   curbuf= 0;
   try{
    lenbuf=in.read(buffer);
   }catch(IOException e) {
    throw new InputMismatchException();
   }
   if(lenbuf<=0) return false;
  }
  return true;
 }
 
 private int readByte(){if(hasNextByte()) return buffer[curbuf++]; else return -1;}

 private boolean isSpaceChar(int c){return !(c>=33&&c<=126);}
 
 private void skip(){while(hasNextByte()&&isSpaceChar(buffer[curbuf])) curbuf++;}

 public boolean hasNext(){skip(); return hasNextByte();}
 
 public String next(){
  if(!hasNext()) throw new NoSuchElementException();
  StringBuilder sb=new StringBuilder();
  int b=readByte();
  while(!isSpaceChar(b)){
   sb.appendCodePoint(b);
   b=readByte();
  }
  return sb.toString();
 }
 
 public int nextInt() {
  if(!hasNext()) throw new NoSuchElementException();
  int c=readByte();
  while (isSpaceChar(c)) c=readByte();
  boolean minus=false;
  if (c=='-') {
   minus=true;
   c=readByte();
  }
  int res=0;
  do{
   if(c<'0'||c>'9') throw new InputMismatchException();
   res=res*10+c-'0';
   c=readByte();
  }while(!isSpaceChar(c));
  return (minus)?-res:res;
 }
 
 public long nextLong() {
  if(!hasNext()) throw new NoSuchElementException();
  int c=readByte();
  while (isSpaceChar(c)) c=readByte();
  boolean minus=false;
  if (c=='-') {
   minus=true;
   c=readByte();
  }
  long res = 0;
  do{
   if(c<'0'||c>'9') throw new InputMismatchException();
   res=res*10+c-'0';
   c=readByte();
  }while(!isSpaceChar(c));
  return (minus)?-res:res;
 }
 
 public double nextDouble(){return Double.parseDouble(next());}
 
 public BigInteger nextBigInteger(){return new BigInteger(next());}
 
 public int[] nextIntArray(int n){
  int[] a=new int[n];
  for(int i=0;i<n;i++) a[i]=nextInt();
  return a;
 }
 
 public char[][] nextCharMap(int n,int m){
  char[][] map=new char[n][m];
  for(int i=0;i<n;i++) map[i]=next().toCharArray();
  return map;
 }
}
}