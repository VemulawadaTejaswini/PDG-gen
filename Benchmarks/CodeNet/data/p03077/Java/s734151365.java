import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    long n = nextLong();
    long[] a = new long[5];
    for(int i=0;i<5;i++){
      a[i] = nextLong();
    }

    long min = minLong(a,5);

    long ans = 0;

    if(n<=min){
      ans = 5;
    }
    else{
      if(n%min==0){
        ans = n/min + 4;
      }
      else{
        ans = n/min + 5;
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

  public static int maxInt(int[] a,int lng){
    int max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static int minInt(int[] a,int lng){
    int min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

  public static long maxLong(long[] a,int lng){
    long max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static long minLong(long[] a,int lng){
    long min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

  public static long minmin(long a,long b){
    long ans = 0;
    if(a>=b){
      ans = b;
    }
    else{
      ans = a;
    }
    return ans;
  }

}
