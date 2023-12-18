import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int calc_result = (a*b)%2;
  
    if(calc_result != 1){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}