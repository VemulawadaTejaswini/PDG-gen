import java.util.*;

class Black{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    
    int sum = num1 + num2 + num3;
    
    if(sum < 21){
      System.out.println("win");
    }else{
      System.out.println("bust");
    }
  }
}
