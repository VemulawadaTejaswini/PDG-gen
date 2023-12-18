import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
 
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int sum = 0;
    int min1 = 0;
    int min2 = 0;
 
    if(a + b < c * 2){
      sum = a * x + b * y;
    }else{
      while(x >= 1 && y >= 1){
        sum += c * 2;
        x--;
        y--;
      }
      min1 = a * x + b * y;
      if(a > c * 2 || b > c * 2){
        while(x >= 1 || y >= 1){
          min2 += c * 2;
          x--;
          y--;
        }
      }
      if(min1 < min2){
        sum += min1;
      }else{
        sum += min2;
      }
    }
 
    System.out.println(sum);
  }
}