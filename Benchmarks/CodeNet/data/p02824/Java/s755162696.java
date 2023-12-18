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

    //スコアが大きい順に採用されるのでソート
    Arrays.sort(a);

    //区切りを摘出
    long tmp1 = a[(int)n-(int)p]; //上からp個目（ぎりぎり採用される奴）
    long tmp2 = a[(int)n-(int)p-1]; //上からp-1個目（ぎりぎり採用されないかもしれない奴）

    //tmp1==tmp2の場合tmp2の次に小さい奴が実質tmp2
    boolean allOK = false;
    if(tmp1==tmp2){
      int cnt = (int)n-(int)p-1; //一応tmp2からスタート（さらに一個下からでも大丈夫そう）
      while(a[cnt]==tmp2){ //同じならまだ選ばれる可能性あり
        cnt--; //REの原因 //次に小さいやつを見る
        if(cnt==0){ //ループ抜けないとa[-1]でRE
          allOK = true; //この場合、全部が選ばれる可能性あり。（答えはnだけど後で代入にしとく）
          break; //RE回避のため
        }
      }
      //ループを抜けると、a[cnt]はtmp2の次に小さいやつ
      if(!allOK){ //一応
        tmp2 = a[cnt]; //ぎりぎり採用されないかもしれない奴
      }
    }

    /////////////////////////////////////
        int x = -1;
        for(int i=0;i<n;i++){
          if(a[i]==tmp1 && x==-1){ //a[i]をしたから見ていき、tmp1に到達すると、それは選ばれる可能性がある最小の値。
            //System.out.println("----------------");
            x = i; //xは選ばれる可能性のある値のうち、最小の配列番号
          }
          //System.out.println("a["+i+"]="+a[i]);
        }
       // System.out.println("確定層の始まり：x="+x);
       // System.out.println("確定層の最小値="+tmp1);
       // System.out.println("未確定層の最大値="+tmp2);
    /////////////////////////////////////

    long ans = n - x; //確定層の個数

    if(v<=p){ //この時、確定層を最低一つ残して、未確定層のうち1つに投票できる。
              //すると、スコアが変化しない確定層が現れ、それ以上のスコアになった問題は選ばれる可能性がある
    ///////////////////////////////////////////
    for(int i=0;i<x;i++){ //xは残された確定層であり、投票されない。
      long sum = a[i] + m; //全ジャッジがa[i]を選択しすると、スコアはm上がる。
      if(sum>=tmp1){  //投票後、a[i]が確定層の最小値を超えれば、
        ans++;  //a[i]は選ばれる可能性が出る。
      }
    }
    ///////////////////////////////////////////
    }
    else if(v>p){
    ///////////////////////////////////////////
    ///////////////////////////////////////////
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

}
