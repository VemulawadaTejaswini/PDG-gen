import java.util.Scanner;
public class Main1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int num1 = A - (B*2);
    if(num1 >= 0){
      System.out.println(num1);
    }else{
      System.out.println("0");
    }
  }
}
