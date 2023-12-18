import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int[][] card = new int[3][3];

    //card input
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        card[i][j] = nextInt();
      }
    }

    //bingo
    int n = nextInt();
    for(int k=0;k<n;k++){
      int b = nextInt();
      //////////////////////////////
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          if(b==card[i][j]){
            card[i][j] = 0;
          }
        }
      }
      //////////////////////////////
    }

    boolean ok = false;

    for(int i=0;i<3;i++){
      if((card[i][0]+card[i][1]+card[i][2])==0){
        ok = true;
      }
    }

    for(int j=0;j<3;j++){
      if((card[0][j]+card[1][j]+card[2][j])==0){
        ok = true;
      }
    }

    if((card[0][0]+card[1][1]+card[2][2])==0){
      ok = true;
    }

    if((card[0][2]+card[1][1]+card[2][0])==0){
      ok = true;
    }

    if(ok){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
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
