import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();
    int m = nextInt();
    int q = nextInt();
    int[] a = new int[q+1];
    int[] b = new int[q+1];
    int[] c = new int[q+1];
    int[] d = new int[q+1];
    for(int i=1;i<=q;i++){
      a[i] = nextInt();
      b[i] = nextInt();
      c[i] = nextInt();
      d[i] = nextInt();
    }

    int[] A = new int[n+1];
    for(int i=1;i<=n;i++){
      A[i] = 1;
    }

    long score = 0;

    long ans = 0;

    while(A[0]<=0){
      //得点計算ゾーン
      for(int i=1;i<=q;i++){
        if(A[b[i]]-A[a[i]]==c[i]){
          score += d[i];
        }
      }
      ans = Math.max(ans,score);
      score = 0;
      /////////////////

      for(int j=n;0<=j;j--){
        A[j]++;
        for(int k=j+1;k<=n;k++){
          A[k] = A[k-1];
        }
        if(A[j]<=m){
          break;
        }
      }
    }


    System.out.println(ans);

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
