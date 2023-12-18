import java.util.*;
import java.io.*;

class Main{
  static long repow(long b,long p,long modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return res;
  }
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream in){
      ins = in;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }else{
        ptr = 0;
        try{
          buflen = ins.read(buffer);
        }catch(IOException e){
          e.printStackTrace();
        }
        if(buflen<=0){
          return false;
        }
      }
      return true;
    }
    private int readByte(){
      if(hasNextByte()){
        return buffer[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isPrintableChar(int c){
      return 33<=c&&c<=126;
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isPrintableChar(buffer[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public String next(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }
    public StringBuilder nextBuilder(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb;
    }
    public double nextDouble(){
      return Double.parseDouble(next());
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          n*=10;
          n+=b-'0';
        }else if(b==-1||!isPrintableChar(b)){
          return minus?-n:n;
        }else{
          throw new NumberFormatException();
        }
        b=readByte();
      }
    }
    public int nextInt(){
      long nl=nextLong();
      if(nl<Integer.MIN_VALUE||Integer.MAX_VALUE<nl){
        throw new NumberFormatException();
      }
      return (int) nl;
    }
    public int[] nextAInt(int n){
      int[] a = new int[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(int[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      for(int i=0;i<n;i++){
        a[i] = nextDouble();
      }
      return a;
    }
    public void nextADouble(double[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextDouble();
      }
    }
  }
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    int n = sc.nextInt();
    String s = sc.next();
    int left=0;
    int right=n/2+1;
    while(left<right){
      int gaze=left+((right-left)/2);
      if(calc(s,gaze,n)){
        left=gaze+1;
      }else{
        right=gaze;
      }
    }
    out.println(left-1);
    out.flush();
  }
  static final int kk=1000007;
  static final int mm=1000000007;
  static long aa=0;
  static boolean calc(String s,int jisu,int n){
    aa=repow(kk,jisu,mm);
    if(jisu==0){return true;}
    for(int i=jisu;n-i>=jisu;i++){
      String s1=s.substring(i);
      String s2=s.substring(i-jisu,i);
      if(rm(s1,s2)){
        return true;
      }
    }
    return false;
  }
  static boolean rm(String s1,String s2){
    int hs1=rh(s1,s2.length());
    int hs2=rh(s2,s2.length());
    for(int i=0;i<s1.length()-s2.length()+1;i++){
      if(hs1==hs2){
        boolean flag=true;
        for(int j=0;j<s2.length();j++){
          if(s1.charAt(i+j)!=s2.charAt(j)){
            flag=false;
            break;
          }
        }
        if(flag){
          return true;
        }
      }
      hs1=nexth(s1,s2.length(),hs1,i);
    }
    return false;
  }
  static int rh(String s,int l){
    long res=0;
    for(int i=0;i<l;i++){
      res=res*kk+s.charAt(i);
      res=res%mm;
    }
    return (int)res;
  }
  static int nexth(String s,int l,int nhs,int nidx){
    if(nidx+l+1>s.length()){
      return 0;
    }
    long res=nhs;
    res*=kk;
    res-=aa*s.charAt(nidx);
    res+=s.charAt(nidx+l);
    res=res%mm;
    res=res<0?res+mm:res;
    return (int)res;
  }
}