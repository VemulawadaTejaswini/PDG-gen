import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    // n m v p
    // a[0] a[1] ... a[n-1]

    long n = nextLong();
    long m = nextLong();
    long v = nextLong();
    long p = nextLong();

    long[] a = new long[(int)n];
    for(int i=0;i<n;i++){
      a[i] = nextLong();
    }

    Arrays.sort(a);

    boolean ok = true;

    long tmp = a[(int)n-(int)p];     //このままで選ばれる下限値
    long tmp2 = a[(int)n-(int)p-1]; //一個下

    //境目が同じ数字だったら
    int cnt = 0;
    long tmp3 = 0;
    if(tmp==tmp2){ //どちらも選べる状態
      cnt = (int)n-(int)p; //一個下からスタート
      while(a[cnt]==tmp2){
        cnt--;
        if(cnt==0){
          ok = false;
          break;
        }
      }
      tmp3 = a[cnt]; //選ばれない上限値
    }
    else{
      tmp3 = tmp2;
      cnt = (int)n-(int)p;
    }

    //tmp = 今okの最低値
    //tmp3 今Nokの最大値

/////////////////////////////////////
    int x = -1;
    for(int i=0;i<n;i++){
      if(a[i]==tmp && x==-1){
//        System.out.println("----------------");
        x = i;
      }
//      System.out.println("a["+i+"]="+a[i]);
    }
//    System.out.println("今okの最低値tmp="+tmp);
//    System.out.println("今Nokの最大値tmp3="+tmp3);
//    xは大丈夫になる初めての配列番号
/////////////////////////////////////

    long ans = n-x;

    if(v<=p){
      for(int i=0;i<x;i++){
        long ttnp = a[i] + m;
        if(ttnp>=tmp){
          ans++;
        }
      }
    }
    else if(v>p){
      long sa = v-p + 1; //1枠残しでザコの中で選ぶ数
      //下からsa番目から見ていく
      for(int i=((int)sa-1);i<x;i++){ //xまで
        long sum = a[i] + m;
        if(sum>=tmp){
          ans++;
        }
      }
    }

    if(!ok){ans = n;}

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

}
