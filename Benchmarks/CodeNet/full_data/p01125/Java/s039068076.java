import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigDecimal;
import java.math.BigInteger;
    
public class Main{
 
static PrintWriter out;
static InputReader ir;
static final int INF=Integer.MAX_VALUE;
static final long LINF=Long.MAX_VALUE;
 
static void solve(){
 HashMap<String,Pair> dir=new HashMap<>();
 dir.put("N",new Pair(1,0));
 dir.put("E",new Pair(0,1));
 dir.put("S",new Pair(-1,0));
 dir.put("W",new Pair(0,-1));
 while(true){
  int n=ir.nextInt();
  if(n==0) return;
  boolean[][] gems=new boolean[21][21];
  boolean[][] visited=new boolean[21][21];
  visted[10][10]=true;
  int cnt=0;
  for(int i=0;i<n;i++){
   int x=ir.nextInt();
   int y=ir.nextInt();
   gems[y][x]=true;
  }
  int m=ir.nextInt();
  Pair now=new Pair(10,10);
  while(m-->0){
   String com=ir.next();
   int t=ir.nextInt();
   for(int i=0;i<t;i++){
    now.add(dir.get(com));
    if(!visited[now.x][now.y]&&gems[now.x][now.y]) cnt++;
    visited[now.x][now.y]=true;
   }
  }
  out.println(cnt==n?"Yes":"No");
 }
}

public static void main(String[] args) throws Exception{
 ir=new InputReader(System.in);
 out=new PrintWriter(System.out);
 solve();
 out.flush();
}

static class Pair{
 int x;
 int y;
 public Pair(int x,int y){
  this.x=x; this.y=y;
 }
 public static Comparator<Pair> X_ORDER=new Comp1();
 public static Comparator<Pair> Y_ORDER=new Comp2();
 private static class Comp1 implements Comparator<Pair>{
  public int compare(Pair p1,Pair p2){
   return (p1.x>p2.x)?1:(p1.x<p2.x)?-1:0;
  }
 }
 private static class Comp2 implements Comparator<Pair>{
  public int compare(Pair p1,Pair p2){
   return (p1.y>p2.y)?1:(p1.y<p2.y)?-1:0;
  }
 }
 public void add(Pair p){this.x+=p.x;this.y+=p.y;}
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
 
 public BigDecimal nextBigDecimal(){return new BigDecimal(next());}
 
 public int[] nextIntArray(int n){
  int[] a=new int[n];
  for(int i=0;i<n;i++) a[i]=nextInt();
  return a;
 }
 
 
 public long[] nextLongArray(int n){
  long[] a=new long[n];
  for(int i=0;i<n;i++) a[i]=nextLong();
  return a;
 }

 public char[][] nextCharMap(int n,int m){
  char[][] map=new char[n][m];
  for(int i=0;i<n;i++) map[i]=next().toCharArray();
  return map;
 }
}
}