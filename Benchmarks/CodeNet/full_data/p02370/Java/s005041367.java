import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigInteger;

public class Main{

static PrintWriter out;
static InputReader ir;

static void solve(){
 int V=ir.nextInt();
 int E=ir.nextInt();
 int[][] e=new int[E][],re=new int[E][];
 for(int i=0;i<E;i++){
  e[i]=new int[]{ir.nextInt(),ir.nextInt(),1};
 }
 int[][][] g=make_graph(V,e);
 ArrayList<Integer> ord=new ArrayList<>();
 boolean[] vis=new boolean[V];
 for(int i=0;i<V;i++) if(g[i].length==0) TopologicalSort(i,g,vis,ord);
 for(int v : ord) out.println(v);
}

public static void TopologicalSort(int now,int[][][] g,boolean[] vis,ArrayList<Integer> ord){
 for(int i=0;i<g[now].length;i++){
  if(!vis[g[now][i][0]]) TopologicalSort(g[now][i][0],g,vis,ord);
 }
 ord.add(now);
}

public static int[][][] make_graph(int n,int[][] e){
 int[][][] ret=new int[n][][];
 int[] cnt=new int[n];
 for(int i=0;i<e.length;i++){
  if(e[i]==null) break;
  cnt[e[i][0]]++;
 }
 for(int i=0;i<n;i++)
  ret[i]=new int[cnt[i]][];
 for(int i=0;i<e.length;i++){
  if(e[i]==null) break;
  ret[e[i][0]][ret[e[i][0]].length-cnt[e[i][0]]--]=new int[]{e[i][1],e[i][2]};
 }
 return ret;
}

public static void main(String[] args) throws Exception{
 ir=new InputReader(System.in);
 out=new PrintWriter(System.out);
 solve();
 out.flush();
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