import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();
    int m = nextInt();

    int[][] AB = new int[n][2];
    for(int i=0;i<n;i++){
      AB[i][0] = nextInt();
      AB[i][1] = nextInt();
    }

    Arrays.sort(AB, (a, b)->a[0]-b[0]);

    int anscnt = 0;
    long ans = 0;

    int cnt = 0;
    while(anscnt!=m){

      //buy 1
      ans += AB[cnt][0];
      anscnt ++;
      AB[cnt][1]--;

      if(AB[cnt][1]==0){
        cnt++;
      }

    }

    System.out.println(ans);


    //System.out.println();

  }

  static int lcm(int a,int b){
    return a*b*gcd(a,b);
  }

  static int gcd(int a,int b){
    if(a%b!=0){
      return gcd(b,a%b);
    }
    else{
      return b;
    }
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
