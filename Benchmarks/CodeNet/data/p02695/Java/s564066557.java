import java.util.*;
import java.io.*;

class Main{
  static class Scnr{
    private final InputStream ins;
    private final byte[] buf=new byte[1024];
    private int ptr=0;
    private int buflen=0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream ins){
      this.ins=ins;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }
      ptr=0;
      try{
        buflen=ins.read(buf);
      }catch(IOException e){
        e.printStackTrace();
      }
      return buflen>0;
    }
    private int readByte(){
      if(hasNextByte()){
        return buf[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isChar(int c){
      return '!'<=c&&c<='~';//33~126
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isChar(buf[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public String next(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb=new StringBuilder();
      int b=readByte();
      while(isChar(b)){
        sb.appendCodePoint(b);
        b=readByte();
      }
      return sb.toString();
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long res=0;
      int b=readByte();
      boolean minus=false;
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          res*=10;
          res+=b-'0';
        }else if(b==-1||!isChar(b)){
          return minus?-res:res;
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
  }
  static int n;
  static int m;
  static int q;
  static int[] ary;
  static int[] a;
  static int[] b;
  static int[] c;
  static int[] d;
  static int max=0;
  public static void main(String[] args){
    Scnr sc=new Scnr();
    n=sc.nextInt();
    m=sc.nextInt();
    q=sc.nextInt();
    a=new int[q];
    b=new int[q];
    c=new int[q];
    d=new int[q];
    for(int i=0;i<q;i++){
      a[i]=sc.nextInt()-1;
      b[i]=sc.nextInt()-1;
      c[i]=sc.nextInt();
      d[i]=sc.nextInt();
    }
    ary=new int[n];
    calc(0);
    System.out.println(max);
  }
  static void calc(int p){
//    System.err.println(p);
    if(p<n){
      for(ary[p]=(p==0?1:ary[p-1]);ary[p]<=m;ary[p]++){
        calc(p+1);
      }
    }else{
//      System.err.println(Arrays.toString(ary));
      int ten=0;
      for(int i=0;i<q;i++){
        if(ary[b[i]]-ary[a[i]]==c[i]){
          ten=ten+d[i];
        }
      }
      max=Math.max(ten,max);
    }
  }
}