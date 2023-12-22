import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.PriorityQueue;
import java.math.BigInteger;
import java.math.BigDecimal;
      
public class Main{
  
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
  
public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
while(true){
int n=ir.nextInt();
if(n==0) break;
Vector[] vs=new Vector[n];
for(int i=0;i<n;i++) vs[i]=new Vector(ir.nextInt(),ir.nextInt());
double ans=0;
for(int i=0;i<n-1;i++) ans+=(double)Math.abs(vs[i].crossP(vs[i+1]))/2;
ans+=(double)Math.abs(vs[n-1].crossP(vs[0]))/2;
out.println(ans);
}
out.flush();
}

static class Vector{

int x;
int y;

public Vector(int x,int y){this.x=x; this.y=y;}

public int crossP(Vector v){return this.x*v.y-this.y*v.x;}

public int dotP(Vector v){return this.x*v.x+this.y*this.y;}

public double length(){return Math.hypot(x,y);}

public String toString(){return "("+this.x+","+this.y+")";}
}

static class InputReader {
private InputStream in;
private byte[] buffer=new byte[1024];
private int curbuf;
private int lenbuf;
  
public InputReader(InputStream in) {this.in=in;}
    
public int readByte() {
if(lenbuf==-1) throw new InputMismatchException();
if(curbuf>=lenbuf){
curbuf= 0;
try{
lenbuf=in.read(buffer);
}
catch (IOException e) {
throw new InputMismatchException();
}
if(lenbuf<=0)
return -1;
}
return buffer[curbuf++];
}
  
public boolean isSpaceChar(int c){return !(c>=33&&c<=126);}
  
private int skip() {int b; while((b = readByte())!=-1&&isSpaceChar(b)); return b;}
  
public String next() {
int b=skip();
StringBuilder sb=new StringBuilder();
while(!isSpaceChar(b)){
sb.appendCodePoint(b);
b=readByte();
}
return sb.toString();
}
   
public int nextInt() {
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
  
public int[] toIntArray(int n){
int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=nextInt();
return a;
}
}
}