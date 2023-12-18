import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(n % 2 == 0){
      System.out.println(n * n / 4);
    }else{
      System.out.println((n + 1) * (n - 1) / 4);
    }
    
  }
}