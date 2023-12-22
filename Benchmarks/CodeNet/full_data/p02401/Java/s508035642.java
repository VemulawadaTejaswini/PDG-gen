import java.util.Scanner;

public class Main{
  // フィールド宣言

  public static void main(String[] args){
    // 入力の受けつけ　3つの文字列として受け取る
    Scanner sc = new Scanner(System.in);

    while(true){
      String line = sc.nextLine();
      String[] input = line.split(" ");
      int num1 = Integer.parseInt(input[0]);
      String op = input[1];
      int num2 = Integer.parseInt(input[2]);

      // 2つ目のopの値によって場合分け
      if(num1 < 0 || num1 > 20000 || num2 < 0 || num2 > 20000){
        System.out.println("数字が範囲外です．0 <= num <= 20,000");
      }

      if(op.equals("?")){
        return;
      }else if(op.equals("+")){
        System.out.println(num1 + num2);
      }else if(op.equals("-")){
        System.out.println(num1 - num2);
      }else if(op.equals("*")){
        System.out.println(num1 * num2);
      }else if(op.equals("/")){
        System.out.println(num1 / num2);
      }else{
        System.out.println("入力が正しくありません");
      }

    }
  }
}

