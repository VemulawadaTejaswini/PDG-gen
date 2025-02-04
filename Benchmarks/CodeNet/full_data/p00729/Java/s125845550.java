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
 for(;;){
  int N=ir.nextInt();
  int M=r.nextInt();
  if(N==0&&M==0) return;
  int r=ir.nextInt();
  int[][] rcd=new int[r][];
  for(int i=0;i<r;i++) rcd[i]=ir.nextIntArray(4);
  Arrays.sort(rcd,new Comparator<int[]>(){
   public int compare(int[] p,int[] q){
    if(p[2]!=q[2]) return Integer.compare(p[2],q[2]);
    if(p[1]!=q[1]) return Integer.compare(p[1],q[1]);
    Integer.compare(p[0],q[0]);
   }
  });
  AL[] segs=new AL[M];
  for(int i=0;i<M;i++) segs[i]=new AL();
  for(int i=0;i<r;i++){
   if(rcd[i][3]==1&&(i+1==r||rcd[i+1][3]==1)){
    AL[rcd[i][2]-1].add(new int[]{rcd[i][0],Integer.MAX_VALUE});
   }
   else{
    AL[rcd[i][2]-1].add(new int[]{rcd[i][0],rcd[i+1][0]});
    i++;
   }
  }
  for(int i=0;i<M;i++) UniteSegmentsAndGetTotalLength(segs[i],1);
  int q=ir.nextInt();
  for(int i=0;i<q;i++){
   int ts=ir.nextInt();
   int te=ir.nextInt();
   int m=ir.nextInt()-1;
   int len=0;
   for(int j=0;j<segs[m].size();j++){
    int[] s=segs[m].get(j);
    if(ts<=s[0]&&te>=s[1]) len+=s[1]-s[0];
    else if(ts>=s[1]||te<=s[0]){}
    else if(ts>=s[0]&&te<=s[1])len+=te-ts;
    else if(ts>=s[0]&&te>=s[1]) len+=s[1]-ts;
    else if(ts<=s[0]&&te<=s[1]) len+=te-s[0];
   }
   out.println(len);
  }
 }
}

static class AL extends ArrayList<int[]>{}

static long UniteSegmentsAndGetTotalLength(AL seg,int k){
 int n=seg.size();
 Point[] ps=new Point[2*n];
 for(int i=0;i<n;i++){
  int[] s=seg.get(i);
  ps[2*i]=new Point(s[0],true);
  ps[2*i+1]=new Point(s[1],false);
 }
 seg.clear();
 Arrays.sort(ps,new Comparator<Point>(){
  public int compare(Point a,Point b){
   if(a.pos!=b.pos) return Integer.compare(a.pos,b.pos);
   if(a.isLeftSide==b.isLeftSide) return 0;
   if(a.isLeftSide) return -1;
   return 1;
  }
 });
 int cur=0,l=-1;
 long ret=0;
 boolean f=false;
 for(int i=0;i<2*n;i++){
  cur+=ps[i].isLeftSide?1:-1;
  if(cur>=k&&!f){
   f=true;
   l=ps[i].pos;
  }
  else if(cur<k&&f){
   f=false;
   if(l!=ps[i].pos) seg.add(new int[]{l,ps[i].pos});
   ret+=ps[i].pos-l;
  }
 }
 return ret;
}

static class Point{

 public int pos;
 public boolean isLeftSide;

 public Point(int pos,boolean isLeftSide){
  this.pos=pos;
  this.isLeftSide=isLeftSide;
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