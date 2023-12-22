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
  int n=ir.nextInt();
  if(n==0) break;
  int ans=1;
  int[] d=new int[]{1,2,4,5,3,6};
  while(n-->0){
   String command=ir.next();
   int top=d[0];
   int front=d[1];
   int left=d[2];
   int back=d[3];
   int right=d[4];
   int bottom=d[5];
   if("North".equals(command)){
    d[3]=top;
    d[0]=front;
    d[1]=bottom;
    d[5]=back;
   }
   else if("East".equals(command)){
    d[4]=top;
    d[5]=right;
    d[2]=bottom;
    d[0]=left;
   }
   else if("West".equals(command)){
    d[2]=top;
    d[0]=right;
    d[4]=bottom;
    d[5]=left;
   }
   else if("South".equals(command)){
    d[1]=top;
    d[5]=front;
    d[3]=bottom;
    d[0]=back;
   }
   else if("Right".equals(command)){
    d[2]=front;
    d[3]=left;
    d[4]=back;
    d[1]=right;
   }
   else{
    d[4]=front;
    d[1]=left;
    d[2]=back;
    d[3]=right;
   }
   ans+=d[0];
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
}
}