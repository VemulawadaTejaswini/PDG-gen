import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();//A
    int b = sc.nextInt();//B
    if(b % a == 0){//BがAで割り切れるかつまり余りがゼロか
      System.out.println(a + b);//A+Bの表示
    } else {
      System.out.println(a - b);//A-Bの表示
    }
  }
}