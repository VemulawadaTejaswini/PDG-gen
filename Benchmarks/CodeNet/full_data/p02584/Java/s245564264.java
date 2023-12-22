import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var X = Long.parseLong(str[0]);
    var K = Long.parseLong(str[1]);
    var D = Long.parseLong(str[2]);

    long ans = 0;

    if ( X < 0 ){
      X = X * -1;
    }

    for (var i=1;i < K+1;i++){
      if ( X > 0 ) {
        X = X - D;
        if ( (X < D) && (K % 2 == 1) && (i % 2 == 1)){
          break;
        } else if ( (X < D) && (K % 2 == 0) && (i % 2 == 0)) {
          break;
        } else if ( (X < D) && (K % 2 == 0) && (i % 2 == 1)) {
          if ( X > 0 ) {
            X = X - D;
          } else {
            X = X + D;
          }
          break;
        } else if ( (X < D) && (K % 2 == 1) && (i % 2 == 0)){
          if ( X > 0 ) {
            X = X - D;
          } else {
            X = X + D;
          }
          break;
        }
      } else {
        X = X + D;
      }
    }

    if (X < 0) {
      ans = -1 * X;
    } else {
      ans = X;
    }

    System.out.println(ans);
    scan.close();
  }
}