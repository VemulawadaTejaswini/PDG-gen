import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    long n = nextLong();
    boolean ok = true;
    if(n==1){
      ok = false;
    }

    String ans = "";
    long memo = 0;

    //名前はlng文字
    int lng = 0;
    for(int i=0;i<n;i++){
      memo = (long)Math.pow(26,i);
      if(n<memo){
        lng = i;
        break;
      }
    }

    //lng文字の一番若い番号はstart
    long start = 1;
    for(int i=1;i<=(lng-1);i++){
      start += (long)Math.pow(26,i);
    }

    //n番目の文字は、lng文字の中ではorder番目
    long order = n - start + 1;


//lng回やる（1回1文字）
int cnt = lng;
for(int x=0;x<cnt;x++){
////////////////////////////////////////////////

  //同じ長さのorder番目の先頭の文字を決定する。
    int block = 0;  //1～26、先頭の文字。
    long ch = 1;
    for(int i=1;;i++){
      ch += (long)Math.pow(26,lng-1); //今lng文字なので、26^(lng-1)区切り
      if(order<ch){ //始めてchが超えたら
        block = i;  //先頭の文字はアルファベットi番目
        ans += AAA(block);  //文字連結
        break;
      }
    }

    //値の更新
    lng--;  //一文字減らす

    //全体の順番の変化は、（ここは合っている）
    n -= (long)(Math.pow(26,lng)) * block;

    //新lng文字の最初の番号
    start = 1;
    for(int i=1;i<=(lng-1);i++){
      start += (long)Math.pow(26,i);
    }

    //新文字の、lngの中で何番目か
    order = n - start + 1;

////////////////////////////////////////////////
}

    if(ok){
      System.out.println(ans);
    }
    else{
      System.out.println("a");
    }

  }

  static String AAA(int block){
    switch(block){
      case 1:
        return "a";
      case 2:
        return "b";
      case 3:
        return "c";
      case 4:
        return "d";
      case 5:
        return "e";
      case 6:
        return "f";
      case 7:
        return "g";
      case 8:
        return "h";
      case 9:
        return "i";
      case 10:
        return "j";
      case 11:
        return "k";
      case 12:
        return "l";
      case 13:
        return "m";
      case 14:
        return "n";
                case 15:
                  return "o";
                case 16:
                  return "p";
                case 17:
                  return "q";
                case 18:
                  return "r";
                case 19:
                  return "s";
                case 20:
                  return "t";
                case 21:
                  return "u";
                case 22:
                  return "v";
                case 23:
                  return "w";
                case 24:
                  return "x";
                case 25:
                  return "y";
                case 26:
                  return "z";
    }
    return "*";
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
