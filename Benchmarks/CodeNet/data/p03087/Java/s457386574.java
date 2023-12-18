import java.util.*;

//update 2019/12/29

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = nextInt();  int Q = nextInt();
    String[] S = splitString(next()); //N == S.length()

    for(int i=0;i<N-1;i++){ //NでRE、N-1でAC ------------↓
      if(S[i].equals("A") && S[i+1].equals("C")){ //[N-1+1]=[N] ⇒RE
        S[i+1] = "c"; //ACの存在をメモ
      }
    }

    int[] num = new int[N+1];

    for(int i=1;i<=N;i++){
      num[i] += num[i-1]; //今までのを追加
      if(S[i-1].equals("c")){ //num[0]を使わないため。
        num[i] += 1; //i文字目にcがあるので、新たに1追加
      }

    }

    //num[i] i文字目までにあるACの数

    for(int i=0;i<Q;i++){
      int l = nextInt();
      int r = nextInt();
      int ans = num[r]-num[l];
      System.out.println(ans);
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
