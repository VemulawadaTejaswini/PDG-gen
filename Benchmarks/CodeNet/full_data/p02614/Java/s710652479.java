import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int h=readI(),w=readI(),k=readI(),all=0;
    char c[][]=new char[h][w];
    int sumh[]=new int[h];
    int sumw[]=new int[w];
    for(int i=0;i<h;i++){
      int co=0;
      for(int j=0;j<w;j++){
        c[i][j]=readC();
        if(c[i][j]=='#'){co++;}
      }
      sumh[i]=co;
      all+=co;
      readC();
    }
    for(int i=0;i<w;i++){
      int co=0;
      for(int j=0;j<h;j++){
        if(c[j][i]=='#'){co++;}
      }
      sumw[i]=co;
    }
    if(k==all){
      int bai=1;
      for(int i=0;i<h;i++){
        if(sumh[i]==0){bai*=2;}
      }
      for(int i=0;i<w;i++){
        if(sumw[i]==0){bai*=2;}
      }
      pl(bai+"");
    }else if(k>all){
      pl("0");
    }else{
      pl(search(h,w,0,0,c,sumh,sumw,new boolean[h],all,k)+"");
    }
  }

  public static int search(int h,int w,int now,int count,char c[][],int sumh[],int sumw[],boolean flgh[],int all,int k){
    if(now==h){
      return search2(h,w,0,count,c,sumh,sumw,flgh,all,k);
    }
    all-=sumh[now];
    if(all>=k){
      flgh[now]=true;
      count=search(h,w,now+1,count,c,sumh,sumw,flgh,all,k);
      flgh[now]=false;
    }
    all+=sumh[now];
    return search(h,w,now+1,count,c,sumh,sumw,flgh,all,k);
  }

  public static int search2(int h,int w,int now,int count,char c[][],int sumh[],int sumw[],boolean flgh[],int all,int k){
    if(now==w){
      if(all==k){
        count++;
      }
      return count;
    }
    all-=sumw[now];
    int cs=0;
    for(int i=0;i<h;i++){
      if(flgh[i]&&c[i][now]=='#'){
        all++;cs++;
      }
    }
    if(all>=k){
      count=search2(h,w,now+1,count,c,sumh,sumw,flgh,all,k);
    }
    all+=sumw[now]-cs;
    return search2(h,w,now+1,count,c,sumh,sumw,flgh,all,k);
  }

  static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
  public static String read(){
    try{
      return ctos((char)br.read());
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static char readC(){
    try{
      return (char)br.read();
    }catch(IOException e){
      e.printStackTrace();
      return (char)-1;
    }
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
  public static long readLong(){
    return stol(readS());
  }
  public static long stol(String s){
    return Long.parseLong(s);
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
