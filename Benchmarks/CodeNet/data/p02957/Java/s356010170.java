import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = 0;
    int y = 0;
    for(int i = 0;i < (b/2);i++){
      x = Math.abs(a - i);
      y = Math.abs(b - i);
      if(x == y){
        System.out.println(x);
        break;
      }
    System.out.println("IMPOSSIBLE");
    }

  }
}