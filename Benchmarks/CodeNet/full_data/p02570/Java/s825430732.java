import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // float型へ変換
    float D = Float.parseFloat(str[0]);
    float T = Float.parseFloat(str[1]);
    float S = Float.parseFloat(str[2]);
    var ans = "No";

    float min = D / S;

    if (min <= T){
      ans = "Yes";
    }

    System.out.println(ans);
    scan.close();
  }
}