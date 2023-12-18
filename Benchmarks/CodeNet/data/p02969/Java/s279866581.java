import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int radius;
    Scanner scanner = new Scanner(System.in);
    System.out.println("整数の値を入力してください");
    while(true) {
        radius = scanner.nextInt();
        
        if(1<=radius && radius<=100) {
          break;
        } else {
          System.out.println("半径の値を1～100の範囲で入力してください");
        }
    }
    double area1 = Math.pow(radius, 2);
    double area2 = 3*area1;
    
    System.out.println("求める面積の値は" + area2 + "です");
  }
}