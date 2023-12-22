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
 int n,m,h,k;
 while(true){
  n=ir.nextInt();
  m=ir.nextInt();
  h=ir.nextInt();
  k=ir.nextInt();
  if(n==0&&m==0&&h==0&&k==0) break;
  int[] s=ir.nextIntArray(n);
  int[][] l=new int[m][];
  for(int i=0;i<m;i++){
   l[i]=ir.nextIntArray(2);
   l[i][0]--;
  }
  Arrays.sort(l,new Comparator<int[]>(){
   public int compare(int[] a,int[] b){
    return Integer.compare(a[1],b[1]);
   }
  });
  int[] pos=new int[n];
  int[][] swp=new int[m][];
  for(int i=0;i<n;i++) pos[i]=i;
  for(int i=0;i<m;i++){
   swp[i]=new int[]{pos[l[i][0]],pos[l[i][0]+1]};
   int temp=pos[l[i][0]];
   pos[l[i][0]]=pos[l[i][0]+1];
   pos[l[i][0]+1]=temp;
  }
  int[] scr=new int[n];
  for(int i=0;i<n;i++) scr[pos[i]]=s[i];
  int tot=0;
  for(int i=0;i<k;i++) tot+=scr[i];
  int ans=tot;
  for(int i=0;i<m;i++){
   if((swp[i][0]<k&&swp[i][1]<k)||(swp[i][0]>=k&&swp[i][1]>=k)) continue;
   else if(swp[i][0]<k) ans=Math.min(ans,tot-scr[swp[i][0]]+scr[swp[i][1]]);
   else ans=Math.min(ans,tot+scr[swp[i][0]]-scr[swp[i][1]]);
  }
  out.println(ans);
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