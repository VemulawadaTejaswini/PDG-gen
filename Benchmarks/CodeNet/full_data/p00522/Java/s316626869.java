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
 int m=ir.nextInt(),n=ir.nextInt();
 int[] p=ir.nextIntArray(m);
 int[][] box=new int[n][];
 for(int i=0;i<n;i++) box[i]=ir.nextIntArray(2);
 mergeSort(p);
 p=reverseArray(p);
 int[][] dp=new int[m+1][n+1];
 int[] sum=new int[m+1];
 for(int i=0;i<m;i++) sum[i+1]+=sum[i]+p[i];
 for(int i=m-1;i>=0;i--){
  for(int j=n-1;j>=0;j--){
   int last=Math.min(i+box[j][0],m);
   dp[i][j]=Math.max(dp[i][j],dp[last][j+1]+sum[last]-sum[i]-box[j][1]);
   dp[i][j]=Math.max(dp[i][j],dp[i][j+1]);
  }
 }
 out.println(dp[0][0]);
}

static int[] buff;

static void __mergeSort(int[] a,int left,int right){
 if(left<right){
  int i,mid=(left+right)/2,p=0,j=0,k=left;
  __mergeSort(a,left,mid);
  __mergeSort(a,mid+1,right);
  for(i=left;i<=mid;i++)
    buff[p++]=a[i];
  while(i<=right&&j<p)
    a[k++]=(buff[j]<=a[i])?buff[j++]:a[i++];
  while(j<p)
    a[k++]=buff[j++];
 }
}
  
static void mergeSort(int[] a){
 buff=new int[a.length];
 __mergeSort(a,0,a.length-1);
 buff=null;
}

public static int[] reverseArray(int[] a){
 int[] ret=new int[a.length];
 for(int i=0;i<n;i++) ret[a.length-1-i]=a[i];
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