import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // long型へ変換
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long c = Long.parseLong(str[2]);
    long d = Long.parseLong(str[3]);

    long aminus = 0;
    long bminus = 0;
    long cminus = 0;
    long dminus = 0;

    long ans = 0;

    if ( a < 0 ){
      aminus = 1;
    }
    if ( b < 0 ){
      bminus = 1;
    }
    if ( c < 0 ){
      cminus = 1;
    }
    if ( d < 0 ){
      dminus = 1;
    }

    if (aminus == 0){
      if (dminus == 1){
        ans = a * d;
      }else{
        ans = b * d;
      }
    }else if (bminus == 1){
      if (cminus == 1){
        ans = a * c;
      }else{
        ans = a * d;
      }
    }else{
      if (cminus == 0){
        ans = b * d;
      }else if(dminus == 1){
        ans = a * c;
      }else{
        long ac = a * c;
        long bd = b * d;
        if (ac < bd){
          ans = bd;
        }else{
          ans = ac;
        }
      }
    }

    System.out.println(ans);
    scan.close();
  }
}