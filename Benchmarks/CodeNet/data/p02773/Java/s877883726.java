import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();

    String[] s = new String[n];
    for(int i=0;i<n;i++){
      s[i] = next();
    }

    Arrays.sort(s);

    int[] cnt = new int[n];
    int m = 0;

    for(int i=0;i<n;i++){
      if(i==0){
        cnt[m]++;
      }
      else{
        if(s[i-1].equals(s[i])){
          cnt[m]++;
        }
        else{
          m++;
          cnt[m]++;
        }
      }
    }
/*
    for(int i=0;i<n;i++){
      System.out.println("s["+i+"]="+s[i]);
    }
    for(int i=0;i<=m;i++){
      System.out.println("cnt["+i+"]="+cnt[i]);
    }
*/

    int max = max(cnt);
    for(int i=0;i<n;i++){
      if(i==0){
        m=0;
      }
      else if(!(s[i-1].equals(s[i]))){
        m++;
      }
      if(cnt[m]==max){
        System.out.println(s[i]);
        i += (max-1);
      }
    }






    //System.out.println();

  }
  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
  }

  static String toBig(String s){
    return s.toUpperCase();
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

  static int charToInt(char a){
    return a - 48;
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
