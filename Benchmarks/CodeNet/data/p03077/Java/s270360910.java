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

    long[] city = new long[7];

    city[1] = n;

    long move = 0;
    long cnt = 0;

    while(true){
      if(city[5]>0){
        move = minmin(a[4],city[5]);
        city[6] += move;
        city[5] -= move;
      }
      if(city[4]>0){
        move = minmin(a[3],city[4]);
        city[5] += move;
        city[4] -= move;
      }
      if(city[3]>0){
        move = minmin(a[2],city[3]);
        city[4] += move;
        city[3] -= move;
      }
      if(city[2]>0){
        move = minmin(a[1],city[2]);
        city[3] += move;
        city[2] -= move;
      }
      if(city[1]>0){
        move = minmin(a[0],city[1]);
        city[2] += move;
        city[1] -= move;
      }

      cnt++;

      if(city[1]<=0 && city[2]<=0 && city[3]<=0 && city[4]<=0 && city[5]<=0){
        System.out.println(cnt);
        break;
      }
    }

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
