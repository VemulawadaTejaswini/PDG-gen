import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    long a = nextLong();
    long b = nextLong();
    long k = nextLong();

    long ans1 = a;
    long ans2 = b;

    if(a>=k){
      ans1 = a-k;
      ans2 = b;
    }
    else{
      long sa = k-a; //saだけ青木から減らす
      if(b>=sa){
        ans1 = 0;
        ans2 = b-sa;
      }
      else{
        ans1 = 0;
        ans2 = 0;
      }

    }

    System.out.println(ans1+" "+ans2);


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

}
