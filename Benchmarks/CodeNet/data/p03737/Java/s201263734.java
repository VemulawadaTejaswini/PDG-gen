
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
//toUpperで大文字に変える
//toLowerで小文字に変える
     String ua = a.toUpperCase();
     String ub = b.toUpperCase();
     String uc = c.toUpperCase();
//substringで出力の文字数の指定
    System.out.println(ua.substring(0,1) + ub.substring(0,1) + uc.substring(0,1));
  }
}
