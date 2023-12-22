import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 入力値を分割する
    String input[] = sc.nextLine().split(" ");

    // 作る個数
    int make = Integer.parseInt(input[0]);
    // 作れる個数
    int cook = Integer.parseInt(input[1]);
    // 1回にかかる時間
    int time = Integer.parseInt(input[2]);

    int amari = make % cook;
    int kaisuu = amari == 0 ? make/cook : make/cook + 1;
    // かかる時間
    int result = kaisuu * time;
    System.out.println(result);
  }
}
