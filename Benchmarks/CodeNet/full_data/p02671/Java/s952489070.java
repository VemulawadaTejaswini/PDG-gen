import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int a = readI();
    String t = readL();
    int n = (int)(Math.pow(3,a));
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int seni[]=new int[n];
    int len = t.length();
    for(int i=0;i<n;i++){
      arr.add(i);
      if(i!=0&&seni[i]==0){
        seni[i] = trans(i);
        seni[seni[i]]=i;
      }
    }
    for(int i=0;i<len;i++){
      char c = t.charAt(i);
      if(c=='S'){
        boolean flg[]=new boolean[n];
        for(int j=1;j<n;j++){
          if(!flg[j]){
            int x = arr.get(j);
            arr.set(j,arr.get(seni[j]));
            arr.set(seni[j],x);
            flg[j]=true;flg[seni[j]]=true;
          }
        }
      }else{
        int x = arr.get(n-1);
        arr.remove(n-1);
        arr.add(0,x);
      }
    }
    int ans[] = new int[n];
    for(int i=0;i<n;i++){
      ans[arr.get(i)]=i;
    }
    pr(ans[0]+"");
    for(int i=1;i<n;i++){
      pr(" "+ans[i]);
    }
    pl("");

  }

  public static int trans(int n){
    int k,r=0;
    int bai=1;
    while(n!=0){
      k = n%3;
      n=n/3;
      if(k==1){
        k=2;
      }else if(k==2){
        k=1;
      }
      r += k*bai;
      bai*=3;
    }
    return r;
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
