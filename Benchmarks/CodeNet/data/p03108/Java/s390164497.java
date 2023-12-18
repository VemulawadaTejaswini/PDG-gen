import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;


  static class pair {
          public int a;
          public int b;

          pair(){
              this.a = 0;
              this.b = 0;
          }

          pair(int a, int b){
              this.a = a;
              this.b = b;
          }

          public void set(int a, int b) {
              this.a = a;
              this.b = b;
          }
      }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();
    int M = scanner.nextInt();
    pair[] map = new pair[M];

    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;

      map[i] = new pair(a,b);




    }

    long ans = nCr(N,2);
    long initans = ans;

//    System.out.println(ans);


    long[] list = new long[M];

    UnionFind[] ufin = new UnionFind[N + 1];
    int[] cnt = new int[N];
      for (int i = 0; i < N; i++) {
          ufin[i] = new UnionFind();
          cnt[i] = 1;
      }

    for (int i = M - 1; i >= 0; i--) {
//        System.out.println(map[i].b);
        if(ufin[map[i].a].same(ufin[map[i].b])) {
//            System.out.println(ans);
            list[i] = ans;
        }else {
            ans += nCr(cnt[map[i].a], 2) + nCr(cnt[map[i].b],2);
            ufin[map[i].a].union(ufin[map[i].b]);
            cnt[map[i].a] += cnt[map[i].b];
            cnt[map[i].b] =cnt[map[i].a];
            ans -= nCr(cnt[map[i].a], 2);

//            System.out.println(ans);
            list[i] = ans;
        }
    }

      for (int i = 1; i < M; i++) {
          System.out.println(list[i]);
      }


      System.out.println(initans);

  }

  static long nCr(long n, long r){
          long bunsi = 1;
          long bunbo = 1;
          bunsi = nbicri(n);

          bunbo = nbicri(n - r) * nbicri(r);

          return bunsi / bunbo;
      }
      static long nbicri(long n){
          long ans = 1;
          for (long i = 2; i <= n; i++) {
              ans = ans * i;
          }
          return ans;
      }



      static long powmod( long a, long n){ // (a^n) % mod

          if(n <= 0)return 1;
          if(n % 2 == 0){
              long temp = powmod(a, n / 2);
              return temp * temp;
          }else{
              long temp = powmod(a, n / 2);
              return (temp * temp) * a;
          }
      }


  /**
       * Using
       * UnionFind[] union = new UnionFind[10];
       * union[a].union(union[b]);
       */
      public static class UnionFind {
          private int id;
          private UnionFind root;
          private int rank;
          public static int id_num = 0;

          UnionFind() {
              this.id = id_num;
              this.root = null;
              this.rank = 1;
              id_num++;
          }


          private UnionFind find() {
              if (this.root == null) return this;
              return this.root.find();
          }

          public boolean same(UnionFind partner) {
              UnionFind x = partner.find();
              UnionFind y = this.find();
              return x.id == y.id;
          }

          public void union(UnionFind partner) {
              UnionFind x = partner.find();
              UnionFind y = this.find();
              if(x.rank > y.rank){
                  y.root = x;
              }else{
                  x.root = y;
                  if(x.rank == y.rank)y.rank++;
              }

              partner.root = this;
          }
      }
}
