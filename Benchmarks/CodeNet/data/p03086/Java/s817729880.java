import java.util.*;

//update 2019/12/29

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    String[] s = splitString(next());

    String[] acgt = {"A","C","G","T"};

    int cnt = 0;
    int ans = 0;

    for(int i=0;i<s.length;i++){
      boolean a = false;
      for(int j=0;j<4;j++){
        if(s[i].equals(acgt[j])){
          a = true;
          break;
        }
      }
      if(a){
        cnt++;
        ans = Math.max(cnt,ans);
      }
      else{
        cnt = 0;
      }
    }

    System.out.println(ans);



  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char aaa){
    return aaa - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
