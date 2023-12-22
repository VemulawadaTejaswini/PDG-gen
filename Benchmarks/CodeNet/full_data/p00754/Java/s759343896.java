import java.io.BufferedReader;
import java.io.InputStreamReader;
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
static BufferedReader ir;

static void solve() throws IOException{
 for(;;){
  String s=ir.readLine();
  if(".".equals(s)) return;
  ArrayList<Character> bra=new ArrayList<>();
  for(int i=0;i<s.length();i++) if(isBrackets(s.charAt(i))) bra.add(s.charAt(i));
  out.println(isBalanced(0,bra.size(),bra)?"yes":"no");
 }
}

public static boolean isBrackets(char s){
 return s=='('||s==')'||s=='['||s==']';
}

public static boolean isLeftBrackets(char s){
 return s=='('||s=='[';
}

public static boolean isBalanced(int l,int r,ArrayList<Character> bra){
 if(l>=r) return true;
 int n=bra.size(); 
 int p=0;
 while(p<n){
  int dep=0,st=p;
  while((i==st||dep!=0)&&i<n){
   if(isLeftBrackets(bra.get(i))) dep++;
   else dep--;
   if(dep<0) return false;
   p++;
  }
  if(bra.get(st)!=reverse(bra.get(p-1))) return false;
  if(!isBalanced(st+1,p-1)) return false;
 }
 return true;
}

public static char reverse(char s){
 if(s=='(') return ')';
 else if(s==')') return '(';
 else if(s=='[') return ']';
 else return '[';
}

public static void main(String[] args) throws Exception{
 ir=new BufferedReader(new InputStreamReader(System.in));
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