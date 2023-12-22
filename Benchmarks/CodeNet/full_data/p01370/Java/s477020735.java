import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigInteger;
 
public class Main{
 
static PrintWriter out;
static InputReader ir;
 
static void solve(){
 for(;;){
  t=ir.nextInt();
  n=ir.nextInt();
  if(t==0&&n==0) return;
  ng=new boolean[OFFSET*2+1][OFFSET*2+1];
  dist=new int[OFFSET*2+1][OFFSET*2+1];
  for(int i=0;i<=OFFSET*2;i++) Arrays.fill(dist[i],INF);
  for(int i=0;i<n;i++) ng[ir.nextInt()+OFFSET][ir.nextInt()+OFFSET]=true;
  sx=ir.nextInt();
  sy=ir.nextInt();
  bfs();
  int ct=0;
  for(int i=0;i<=OFFSET*2;i++) for(int j=0;j<=OFFSET*2;j++) if(dist[i][j]!=INF) ct++;
  out.println(ct);
 }
}
 
static int t,n,sx,sy;
static final int OFFSET=30,INF=1<<25;
static boolean[][] ng;
static final int[] dx=new int[]{0,-1,-1,0,1,1},dy=new int[]{1,0,-1,-1,0,1};
static int[][] dist;

public static void bfs(){
 Deque<int[]> que=new ArrayDeque<>();
 dist[sx+OFFSET][sy+OFFSET]=0;
 que.offerLast(new int[]{sx,sy});
 while(!que.isEmpty()){
  int[] p=que.pollFirst();
  for(int i=0;i<6;i++){
   int nx=p[0]+dx[i],ny=p[1]+dy[i];
   if(ng[nx+OFFSET][ny+OFFSET]||dist[nx+OFFSET][ny+OFFSET]!=INF) continue;
  // dist[nx+OFFSET][ny+OFFSET]=dist[p[0]+OFFSET][p[1]+OFFSET]+1;
   if(dist[nx+OFFSET][ny+OFFSET]<t) que.offerLast(new int[]{nx,ny});
  }
 }
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