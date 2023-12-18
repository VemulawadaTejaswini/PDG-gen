import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String x = sc.next();
    //文字数を検索→先頭と最後尾以外を置換
    String y = x.substring(1, x.length - 1);
    String z = (x.length -2).toString();
    System.out.println(x.replace(y, z);
  }
}