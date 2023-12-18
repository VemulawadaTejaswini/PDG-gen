import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int alen = String.valueOf( a ).length();
    for(; alen > 1; alen--){
      int ten = 10;
      ten = ten * 10;
    }
    int num = ten * a + b;
    double k = Math.sqrt(num);
    if(k * k == num){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}