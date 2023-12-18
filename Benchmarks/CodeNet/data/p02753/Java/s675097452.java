import java.util.Scanner;
import java.lang.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //キーボードから文字列を入力
    String S = sc.next();
    //1文字目、2文字目、3文字目を取り出す
    char a = S.charAt(0);
    char b = S.charAt(1);
    char c = S.charAt(2);

	if(a!=b||b!=c||a!=c){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
 }
}