import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s = sc.next();

    //文字列から0を取り除く。
    s = s.replaceAll("0", "");

    //文字数を出力する。
    System.out.println(s.length());
	 }
}