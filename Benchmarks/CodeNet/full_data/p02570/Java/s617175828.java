import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    int D = Integer.parseInt(str[0]);
    int T = Integer.parseInt(str[1]);
    int S = Integer.parseInt(str[2]);
    var ans = "No";

    int min = D / S;

    if (min <= T){
      ans = "Yes";
    }

    System.out.println(ans);
    scan.close();
  }
}