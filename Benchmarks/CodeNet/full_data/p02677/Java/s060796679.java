import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int a = readI(),b = readI(),h=readI(),m=readI();
    h = 60*h+m;
    double rada = 0.5*h,radb = m*6.0;
    double rad = Math.abs(rada-radb);
    if(rad>180){rad=360-rad;}
    rad = rad*2*Math.PI/360;
    double k = Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
    pl(k+"");
  }

  public static long search(int now,int n,int m,int x,long nowm,int[]rikai,int money[],int[][]book,long min){
    boolean flg=true;
    nowm+=money[now];
    for(int i=0;i<m;i++){
      rikai[i]+=book[now][i];
      if(rikai[i]<x){
        flg=false;
      }
    }
    if(flg){
      if(min==-1||min>nowm){
        min = nowm;
      }
    }else{
      for(int i=now+1;i<n;i++){
        min = search(i,n,m,x,nowm,rikai,money,book,min);
      }
    }
    for(int i=0;i<m;i++){
      rikai[i]-=book[now][i];
    }
    nowm-=money[now];
    if(now!=n-1){
      min = search(now+1,n,m,x,nowm,rikai,money,book,min);
    }
    return min;
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
