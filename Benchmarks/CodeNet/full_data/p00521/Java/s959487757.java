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
    
public class Main{

static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static int m,n;
static char[][] flag;
static char[][] emblem;
static final char JOI={'J','O','I'};
    
public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
m=ir.nextInt();
n=ir.nextInt();
flag=ir.makeCharMap(m,n);
emblem=ir.makeCharMap(2,2);
int ans=numOfEmblems();
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
for(int k=0;k<3;k++){
if(flag[i][j]!=JOI[k]){
char c=flag[i][j];
flag[i][j]=JOI[k];
ans=Math.max(ans,numOfEmblems());
flag[i][j]=c;
}
}
}
}
out.println(ans);
out.flush();
}

public staitc int numOfEmblem(){
int cnt=0;
for(int i=0;i<m-1;i++){
for(int j=0;j<n-1;j++){
if(flag[i][j]==emblem[0][0]&&flag[i][j+1]==emblem[0][1]&&flag[i+1][j]==emblem[1][0]&&flag[i+1][j+1]==emblem[1][1]) cnt++;
}
}
return cnt;
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

public char[][] makeCharMap(int m,int n){
char[][] map=new char[m][n];
for(int i=0;i<m;i++) map[i]=ir.next().toCharArray();
}
}