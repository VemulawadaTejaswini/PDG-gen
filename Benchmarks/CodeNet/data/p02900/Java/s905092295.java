//繰り返し二乗法 repow(b,p)(b,p,modder)
//ユークリッド互除法で最大公約数 gcd
//gcdで最小公倍数 lcm
//約数列挙divList(int)
//BSA()()()(List<T>,T,int,int,Comparator<T>)
//BSF()()()(List<T>,T,int,int,Comparator<T>)
//BSL()()()(List<T>,T,int,int,Comparator<T>)
//int kmp(String t,String p)
//文字列文字ソートStSort(String)
//二次元整数座標オブジェクトXy
////マンハッタン距離manht(Xy)
////toString
////偏角ソート用hencom
////偏角henkaku
////equals
//スキャナーScnr
////next nextBuilder nextInt nextLong nextDouble()
////nextAInt nextALong nextADouble(n)(a[],n)
////nextLInt nextLLong nextLDouble(n)(List<>,n)
//static PrintWriter out = new PrintWriter(System.out);
import java.util.*;
import java.io.*;

class Main{
  static int repow(int b,int p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return (int)res;
  }
  static int repow(int b,int p,int modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return (int)res;
  }
  static long repow(long b,long p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return res;
  }
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
  static long gcd(long c,long d){
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;
    }
  }
  static long lcm(long c,long d){
    return c/gcd(c,d)*d;
  }
  static ArrayList<Integer> divList(int n){
    ArrayList<Integer> div=new ArrayList<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        if(i*i!=n){
          div.add((int)(n/i));
        }
      }
    }
    return div;
  }
  static <T extends Comparable> int BSA(List<T> l,T target){
    return BSA(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(List<T> l,T target,Comparator<T> c){
    return BSA(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSA(List<T> l,T target,int left,int right){
    return BSA(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }else{
        return lt+(rt-lt)/2;
      }
    }
    return -1;
  }
  static <T extends Comparable> int BSF(List<T> l,T target){
    return BSF(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(List<T> l,T target,Comparator<T> c){
    return BSF(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSF(List<T> l,T target,int left,int right){
    return BSF(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>=0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static <T extends Comparable> int BSL(List<T> l,T target){
    return BSL(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(List<T> l,T target,Comparator<T> c){
    return BSL(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSL(List<T> l,T target,int left,int right){
    return BSL(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<=0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int kmp(String t,String p){
    int[] f=new int[p.length()+1];
    int i=0;
    int j=1;
    f[1]=0;
    while(j<p.length()){
      if(i==0||p.charAt(i-1)==p.charAt(j-1)){
        i++;
        j++;
        f[j]=i;
      }else{
        i=f[i];
      }
    }
    i=1;
    j=1;
    while(i<=p.length()&&j<=t.length()){
      if(i==0||p.charAt(i-1)==t.charAt(j-1)){
        i++;
        j++;
      }else{
        i=f[i];
      }
    }
    return i==(p.length()+1)?j-i:-1;
  }
  static String StSort(String s){
    StringBuilder sb = new StringBuilder(s);
    int lg = sb.length();
    int l;
    int r;
    int gaze;
    for(int i=1;i<lg;i++){
      l=0;
      r=i-1;
      while(l<=r){
        gaze=(l+r)/2;
        if(sb.charAt(gaze)<=sb.charAt(i)){
          l=gaze+1;
        }else if(sb.charAt(gaze)>sb.charAt(i)){
          r=gaze-1;
        }
      }
      sb.insert(l,sb.charAt(i));
      sb.deleteCharAt(i+1);
    }
    return sb.toString();
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
    public int manht(Xy o){
      return Math.abs(x-o.x)+Math.abs(y-o.y);
    }
    public String toString(){
      return "["+x+","+y+"]";
    }
    public double henkaku(){
      return Math.atan2(y,x);
    }
    public static int hencom(Xy s1,Xy s2){
      return (int)Math.signum(s1.henkaku()-s2.henkaku());
    }
    public boolean equals(Object o){
      return x==((Xy)o).x&&y==((Xy)o).y;
    }
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
      nextADouble(a,n);
      return a;
    }
    public void nextADouble(double[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextDouble();
      }
    }
    public List<Integer> nextLInt(int n){
      List<Integer> l = new ArrayList<>(n);
      nextLInt(l,n);
      return l;
    }
    public void nextLInt(List<Integer> l,int n){
      for(int i=0;i<n;i++){
        l.add(sc.nextInt());
      }
    }
    public List<Long> nextLLong(int n){
      List<Long> l = new ArrayList<>(n);
      nextLLong(l,n);
      return l;
    }
    public void nextLLong(List<Long> l,int n){
      for(int i=0;i<n;i++){
        l.add(sc.nextLong());
      }
    }
    public List<Double> nextLDouble(int n){
      List<Double> l = new ArrayList<>(n);
      nextLDouble(l,n);
      return l;
    }
    public void nextLDouble(List<Double> l,int n){
      for(int i=0;i<n;i++){
        l.add(sc.nextDouble());
      }
    }
  }
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=gcd(a,b);
    long cc=c;
    Set<Long> sos = new HashSet<>();
    for(long i=1;i*i<=c;i++){
      if(cc%i==0){
        if(iP(i)){
          sos.add(i);
          cc=calc(cc,i);
        }
        /*
        if(iP(c/i)){
          sos.add(c/i);
          c=calc(c,c/i);
        }
        */
      }
    }
    out.println(sos.size()/*+sos.toString()*/);
    out.flush();
  }
  static boolean iP(long i){
    if(i==2||i==3||i==5||i==7||i==11||i==13||i==17||i==19||i==23||i==29){
      return true;
    }
    if(i/2*2==i||i/3*3==i||i/5*5==i||i/7*7==i||i/11*11==i||i/13*13==i||i/17*17==i||i/19*19==i||i/23*23==i||i/29*29==i){
      return false;
    }
    if(repow(2,i-1,i)==1){
      if(repow(165,i-1,i)==1){
        return true;
      }
    }
    return false;
  }
  static long calc(long cc,long w){
    if(w==1){return cc;}
    long x=w*w;
    long c=cc;
    while(c%x==0){
      c/=x;
    }
    while(c%w==0){
      c/=w;
    }
//    out.println(" "+c);
    return c;
  }
}
