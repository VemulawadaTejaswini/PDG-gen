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
 int n=ir.nextInt();
 while(n-->0){
   String s=ir.next();
   int cur=0;
   char[] str=new char[1501];
   Arrays.fill(str,'-');
   for(int i=0;i<s.length();i++) str[i]=s.charAt(i);
   int m=ir.nextInt();
   while(m-->0){
     String com0=ir.next(),com1=ir.next();
     if("forward".equals(com0)){
       if("char".equals(com1)){
         if(str[cur]!='-') cur++;
       }
       else if("word".equals(com1)){
         while(str[cur]==' ') cur++;
         while(str[cur]!=' '&&str[cur]!='-') cur++;
       }
     }
     else if("backward".equals(com0)){
       if("char".equals(com1)){
         if(cur>0) cur--;
       }
       else if("word".equals(com1)){
         while(cur>0&&str[cur-1]==' ') cur--;
         while(cur>0&&str[cur-1]!=' ') cur--;
       }
     }
     else if("insert".equals(com0)){
       if(com1.length()>2){
         String insertionStr=com1.substring(1,com1.length()-1);
         for(int i=MAX-insertionStr.length();i>=cur;i--){
           if(str[i]!='-') str[i+insertionStr.length()]=str[i];
         }
         for(int i=0;i<insertionStr.length();i++){
           str[cur+i]=insertionStr.charAt(i);
         }
         cur+=insertionStr.length();
       }
     }
     else if("delete".equals(com0)){
       if("char".equals(com1)){
         if(str[cur]!='-'){
           for(int i=cur;;i++){
             if(str[i]=='-') break;
             str[i]=str[i+1];
           }
         }
       }
       else if("word".equals(com1)){
         int cnt=cur;
         while(str[cnt]==' ') cnt++;
         if(str[cnt]!='-'){
           while(str[cnt]!=' '&&str[cnt]!='-') cnt++;
           for(int i=cur;;i++){
             if(str[i]=='-') break;
             str[i]=str[i-cur+cnt];
           }
         }
       }
     }
   }
   StringBuilder sb=new StringBuilder();
   for(int i=0;;i++){
     if(i==cur) sb.append("^");
     if(str[i]=='-') break;
     sb.append(String.valueOf(str[i]));
   }
   out.println(sb);
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