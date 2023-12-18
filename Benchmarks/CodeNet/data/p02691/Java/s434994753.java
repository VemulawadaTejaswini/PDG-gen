import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = stoi(readL(br)),count=0;
    int a[]=new int[n-1];
    for(int i=0;i<n;i++){
      int k = readI(br);
      if(0<i-k){
        count+=a[i-k];
      }
      if(i+k<n-1){
        a[i+k]++;
      }
    }
    pl(count+"");
  }

  public static String readL(BufferedReader br){
    try{
      return br.readLine();
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static String readS(BufferedReader br){
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
  public static int readI(BufferedReader br){
    return stoi(readS(br));
  }
  public static String[] readSs(BufferedReader br){
    return readL(br).split(" ");
  }
  public static int[] readIs(BufferedReader br){
    return stoi(readSs(br));
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
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
}
