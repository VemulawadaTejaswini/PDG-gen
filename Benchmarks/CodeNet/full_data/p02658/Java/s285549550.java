import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    long test = 1000000000000000000L;
    int n = readI();
    long a[]=new long[n];
    long r=1;
    for(int i=0;i<n;i++){
      a[i]=readLong();
      if(a[i]==0){
        r=0;break;
      }
    }
    if(r!=0){
      for(int i=0;i<n;i++){
        r*=a[i];
        if(r>test||r<a[i]){
          r=-1;break;
        }
      }
    }
    pl(r+"");
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
  public static long readLong(){
    return Long.parseLong(readS());
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
  public static int[] Itoi(Integer a[]){
    int[]result=new int[a.length];
    for(int i=0;i<a.length;i++){
      result[i]=a[i];
    }
    return result;
  }
}
