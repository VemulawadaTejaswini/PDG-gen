import java.util.*;
import java.io.*;
class Main{
  static int n;
  static long a[],rv[];
  public static void main(String args[]){
    n = readI();
    a=new long[n+1];
    rv=new long[n+1];
    long count=0;
    a[0]=readI();
    rv[0]=1-a[0];
    if(a[0]>0){pl(-1+"");System.exit(0);}
    for(int i=1;i<n+1;i++){
      a[i]=readI();
      rv[i]=rv[i-1]*2-a[i];
      if(rv[i]<0){pl(-1+"");System.exit(0);}
    }
    rv[n]=0;
    for(int i=n-1;i>=0;i--){
      long k=rv[i+1]+a[i+1];
      if(k>rv[i]*2){
        count=-1;break;
      }else if(k<rv[i]){
        rv[i]=k;
      }
    }
    for(int i=0;i<n+1;i++){
      count+=rv[i]+a[i];
    }
    pl(count+"");
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
