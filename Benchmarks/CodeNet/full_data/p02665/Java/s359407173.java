import java.util.*;
import java.io.*;
class Main{
  static int n;
  static int a[],rv[];
  public static void main(String args[]){
    n = readI();
    a=new int[n+1];
    rv=new int[n+1];
    int count=0;
    for(int i=0;i<n+1;i++){
      a[i]=readI();
    }
    rv[n]=a[n];
    int z = func(n-1);
    if(z!=-1){
      for(int i:rv){
        count+=i;
      }
    }else{
      count=-1;
    }
    pl(count+"");
  }

  public static int func(int now){
    int v = rv[now+1] + a[now];
    int s = beki(now);
    int r=0;
    if(v>s){
      int ss= s-a[now];
      if(ss<=0){return -1;}
      if(rv[now+1]>ss*2){
        return ss*2;
      }
      v = s;
    }
    rv[now]=v;
    pl(now+" "+rv[now]);
    if(now==0){return 0;}
    else{
      r = func(now-1);
      while(r>0){
        v=r-a[now];
        if(v<0){return -1;}
        if(rv[now+1]>v*2){
          return v*2;
        }
        rv[now] = r;
        pl(now+" "+rv[now]);
        r = func(now-1);
      }
    }
    return r;
  }

  public static int beki(int m){
    long a = 2,x=1;
    if(m==0){return 1;}
    else if(m==1){return 2;}
    while(m>1){
      if(m%2==1){x*=a;}
      m/=2;
      a*=a;
      if(a*x>100000000){
        return 100000000;
      }
    }
    return (int)(a*x);
  }

  static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
  public static String readL(){
    try{
      return br.readLine();
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static String readS(){
    StringBuilder sb = new StringBuilder();
    while(true){
      try{
        int k = br.read();
        if(k==-1||(char)k==' '||(char)k=='\n'){break;}
        sb.append((char)k);
      }catch(IOException e){
        e.printStackTrace();
      }
    }
    return sb.toString();
  }
  public static int readI(){
    return stoi(readS());
  }
  public static String[] readSs(){
    return readL().split(" ");
  }
  public static int[] readIs(){
    return stoi(readSs());
  }
  public static int stoi(String s){
    return Integer.parseInt(s);
  }
  public static int[] stoi(String s[]){
    int a[]=new int[s.length];
    for(int i=0;i<s.length;i++){
      a[i]=stoi(s[i]);
    }
    return a;
  }
  public static String itos(int i){
    return String.valueOf(i);
  }
  public static String[] itos(int[] a){
    String s[]=new String[a.length];
    for(int i=0;i<a.length;i++){
      s[i]=itos(a[i]);
    }
    return s;
  }
  public static String ctos(char c){
    return String.valueOf(c);
  }
  public static String cstos(char[] c){
    return new String(c);
  }
  public static char stoc(String s){
    return s.charAt(0);
  }
  public static char[] stocs(String s){
    return s.toCharArray();
  }
}
