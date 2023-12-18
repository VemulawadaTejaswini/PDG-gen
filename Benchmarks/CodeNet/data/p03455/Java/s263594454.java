import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int a = sin.nextInt();
    int b = sin.nextInt();
    int ab = a*b;
    if(ab%2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }  
  }  
}