import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    if(total < 1200){
      System.out.println("ABC");
    }else if(total < 2800){
      System.out.println("ARC");
    }else{
      System.out.println("AGC");
    }
    
  }
}